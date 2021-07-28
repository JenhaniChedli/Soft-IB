package tn.esprit.spring.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.ClientService;


@Api( description="API pour les opérations CRUD sur les Clients.")
@RestController
public class ClientController {
	@Autowired
	ClientService clientservice;

	@GetMapping("/retrieve-all-Client")	
	public List<Client> getClient(){
		 List<Client> list = clientservice.retrieveAllClients();
		 return list;
	}
	@GetMapping("/retreive-Client/{Client-id}")
	public Client retrieveClient(@PathVariable("Client-id") Long ClientId){
		return clientservice.retrieveClient(ClientId);
	}
	@PostMapping("/add-Client")
	public Client addClient(@RequestBody Client c){
		return clientservice.addClient(c) ;
	}
	@DeleteMapping("/remove-Client/{Client-id}")
	public void deleteClient(@PathVariable("Client-id") Long ClientId ){
		clientservice.deleteClient(ClientId);
	}
	@PutMapping("/update-Client")
	@ResponseBody
	public Client modifyClient(@RequestBody Client c){
		return clientservice.updateClient(c);
		  
	}
	@PutMapping("/active-Client/{Client-id}")
	@ResponseBody
	public Client activeClient(@PathVariable("Client-id") Long ClientId){
		Client c =clientservice.retrieveClient(ClientId);
		c.setActivated(true);
		return clientservice.updateClient(c);
		  
	}
	@PutMapping("/desactive-Client/{Client-id}")
	@ResponseBody
	public Client desactiveClient(@PathVariable("Client-id") Long ClientId){
		Client c =clientservice.retrieveClient(ClientId);
		c.setActivated(false);
		return clientservice.updateClient(c);
		  
	}
    @PostMapping("/upload-photo")
    public String uploadphoto(Long idClient,@RequestParam("image") MultipartFile multipartFile) throws IOException {
         Client c = clientservice.retrieveClient(idClient);
         Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");  
         String strDate = dateFormat.format(date);  
        String fileName =strDate+ StringUtils.cleanPath(multipartFile.getOriginalFilename());
        c.setNamephoto(fileName);
         
        String uploadDir = "uploads/" ;
        Path uploadPath = Paths.get(uploadDir);
        
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
         
        try (java.io.InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {        
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
        clientservice.updateClient(c);
		return c.getNamephoto();      
         
    }
}
