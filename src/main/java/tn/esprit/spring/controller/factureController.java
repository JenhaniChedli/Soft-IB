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

import tn.esprit.spring.entity.facture;
import tn.esprit.spring.service.Ifacture;

@RestController
public class factureController {
	@Autowired
	Ifacture factu;
	@GetMapping("/affichefacture")
	   public List<facture> getFacture(){
		   List<facture> factura=factu.retrieveAllFacture();
		   return factura;
	   }
	@GetMapping("/retreive-fact/{fact-id}")
	@ResponseBody
	public facture retrieveFacture(@PathVariable("fact-id") int factId){
		return factu.retrieveFacture(factId);
	}
	@PostMapping("/add-fact")
	@ResponseBody
	public facture addFacture(@RequestBody facture factur){
		return factu.add(factur) ;
	}
	
	@PutMapping("/update-fact")
	@ResponseBody
	public facture updateFacture(@RequestBody facture factur){
		return factu.updateFacture(factur);
		
	}
	@DeleteMapping("/supprimer-facture/{fact-id}")
	@ResponseBody

	public void supprimerFacture(@PathVariable("fact-id") int id){
		factu.deleteFacture(id);
	}
	

}
