package tn.esprit.spring.controller;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.service.AdminService;

@Api( description="API pour les opérations CRUD sur les Admins.")
@RestController
public class AdminController {
	private static final Logger logger=Logger.getLogger(AdminController.class);
	@Autowired
	AdminService adminservice;
	
	@Autowired
	public JavaMailSender emailSender;
	 
	@GetMapping("/retrieve-all-admin")	
	public List<Admin> getalladmin(){
		 List<Admin> list = adminservice.retrieveAllAdmins();
		 return list;
	}
	@GetMapping("/retreive-admin/{admin-id}")
	public Admin retrieveadmin(@PathVariable("admin-id") Long adminId){
		return adminservice.retrieveAdmin(adminId);
	}
	@PostMapping("/add-Admin")
	public Admin addadmin(@RequestBody Admin a){
		return adminservice.addAdmin(a) ;
	}
	@DeleteMapping("/remove-admin/{admin-id}")
	public void deleteadmin(@PathVariable("admin-id") Long adminId ){
		adminservice.deleteAdmin(adminId);
	}

	@GetMapping("/login/{nomAdmin}/{password}")
	@ResponseBody
	public Admin Login(@PathVariable("nomAdmin") String nomAdmin,@PathVariable("password") String password){
		logger.info("login : ");
		 String crypte="";
		    for (int i=0; i<password.length();i++)  {
	            int c=password.charAt(i)^48; 
	            crypte=crypte+(char)c;
	        }
		Admin a = adminservice.login(nomAdmin, crypte);	 
		logger.info(a);
		a.setLogged(true);
		 return adminservice.updateAdmin(a);
	}
	@GetMapping("/login/count")
	@ResponseBody
	public int countLogin(){
		logger.info("nbr admin is logged : ");
		int a = adminservice.countlogin();	 
		logger.info(a);
		 return a;
	}	
	@GetMapping("/logout/{id}")
	@ResponseBody
	public Admin logout(@PathVariable("id") Long adminId){
		logger.info("logout : ");
		Admin a =adminservice.retrieveAdmin(adminId);
		a.setLogged(false);
		logger.info(a);
		 return adminservice.updateAdmin(a);
	}
	@PutMapping("/updateAdmin")
	@ResponseBody
	public Admin modifyAdmin(@RequestBody Admin a){
		return adminservice.updateAdmin(a);
		  
	}	
	@GetMapping("/getadminbyemail/{email}")
	public Admin getadminbyemail(@PathVariable("email") String email){
		return  adminservice.getAdminByEmail(email);
	}
    @GetMapping("/restpassword/{email}")
    public String restpassword(@PathVariable("email") String email) throws MailException{
    	Admin a = adminservice.getAdminByEmail(email);
   	 
    	int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
       
        a.setPassword(generatedString);
        adminservice.updateAdmin(a);
        SimpleMailMessage message = new SimpleMailMessage();
         
        message.setTo(email);
        message.setSubject("Password SoftIB ");
        message.setText("Hello, New Password : "+generatedString);
 
        this.emailSender.send(message);
 
        return "Email Sent!";
    }
}
