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

import io.swagger.annotations.Api;
import tn.esprit.spring.entity.Agence;
import tn.esprit.spring.service.Iagenceserv;


@Api( description="API pour les opérations CRUD sur les Agences.")
@RestController
public class agenceController {
	@Autowired
	Iagenceserv agencon;
	
   @GetMapping("/afficheragence")
   public List<Agence> getAgences(){
	   List<Agence> agences=agencon.retrieveAllAgence();
	   return agences;
   }
	@GetMapping("/retreive-agence/{agence-id}")
	public Agence retrieveEmployee(@PathVariable("agence-id") int agenId){
		return agencon.retrieveAgence(agenId);
	}
	
	@PostMapping("/add-agence")
	@ResponseBody
	public Agence addemployer(@RequestBody Agence agen){
		return agencon.add(agen) ;
	}
	
	@PutMapping("/update-agence")
	@ResponseBody
	public Agence updateagence(Agence agen){
		return agencon.updateAgence(agen);
	}
	@DeleteMapping("/remove-agence/{agence-id}")
	@ResponseBody
	public void deleteEmployee(@PathVariable("agence-id") int Id ){
		agencon.deleteAgence(Id);
	}
	
	
	
}
