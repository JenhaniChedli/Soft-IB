package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminservice;
	
	@GetMapping("/retrieve-all-admin")	
	public List<Admin> getadmin(){
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
}
