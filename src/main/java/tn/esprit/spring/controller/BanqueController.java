package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Banque;
import tn.esprit.spring.service.banqueImpl;

@RestController
public class BanqueController {
	@Autowired
	banqueImpl bankserv;
	@GetMapping("/afficherBank")
	   public List<Banque> getBanque(){
		   List<Banque> banks=bankserv.retrieveAllBanque();
		   return banks;
	   }
	@GetMapping("/retreive-bank/{bank-id}")
	@ResponseBody
	public Banque retrieveBanque(@PathVariable("bank-id") int bankId){
		return bankserv.retrieveBanque(bankId);
	}
	@PostMapping("/add-bank")
	@ResponseBody
	public Banque addBank(@RequestBody Banque banks){
		return bankserv.add(banks) ;
	}
	
	@PutMapping("/update-bank")
	@ResponseBody
	public Banque updateagence(Banque banks){
		return bankserv.updateBanque(banks);
		
	}
	@DeleteMapping("/supprimer-agence/{banks-id}")
	@ResponseBody

	public void supprimerBank(@PathVariable("banks-id") int id){
		bankserv.deleteBanque(id);
	}
	
	
	
	
	

}
