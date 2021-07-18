package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.ClientService;



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
}
