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

import tn.esprit.spring.entity.credit;
import tn.esprit.spring.service.Icredit;

@RestController
public class creditController {
	
	@Autowired
	Icredit creditService;
@GetMapping("/affichecredit")
public List<credit> getCredit(){
	   List<credit> crds=creditService.retrieveAllCredit();
	   return crds;
}
@GetMapping("/retreive-credit/{credit-id}")
@ResponseBody
public credit retrieveCredit(@PathVariable("credit-id") int creditId){
	return creditService.retrieveCredit(creditId);
}
@PostMapping("/add-crd")
@ResponseBody
public credit addCredit(@RequestBody credit credits){
	return creditService.add(credits) ;
}

@PutMapping("/update-crd")
@ResponseBody
public credit updateCredit(credit credits){
	return creditService.updateCredit(credits);
	
}
@DeleteMapping("/supprimer-credit/{credit-id}")
@ResponseBody

public void supprimerCredit(@PathVariable("crd-id") int id){
	creditService.deleteCredit(id);
}


}
