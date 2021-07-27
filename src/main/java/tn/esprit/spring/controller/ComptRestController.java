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
import tn.esprit.spring.entity.Compte;
import tn.esprit.spring.service.CompteService;

@Api( description="API pour les opérations CRUD sur les Compte.")
@RestController
public class ComptRestController {

	@Autowired
	CompteService CmpServ;
	
	//------------------------------------------------------------------------
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Compte
	
		@GetMapping("/retrieve-all-Compte")
		@ResponseBody
		public List<Compte> getCompte(){										//retrieve-all-Compte

		List<Compte> listComptes = CmpServ.retrieveALLCompte();
		return listComptes;

		}
	//------------------------------------------------------------------------
		  // http://localhost:8081/SpringMVC/servlet/retrieve-Compte/{Compte-id}
		
		@GetMapping("/retrieve-Compte/{Compte-id}")
		@ResponseBody														//retrieve Compte by ID
		public Compte retrieveCompte(@PathVariable("Compte-id") long Num_compt){
			
		return CmpServ.retrieveCompte(Num_compt);
	    }

		//------------------------------------------------------------------------
			//add User : http://localhost:8081/SpringMVC/servlet/add-Compte

			@PostMapping("/add-Compte")												// Create Compte
			public Compte addCompte(@RequestBody Compte cp){
				CmpServ.addCompte(cp);
				return cp;
				
			}
		
			//------------------------------------------------------------------------
			
			// http://localhost:8081/SpringMVC/servlet/remove-Compte/{Compte-id}

			@DeleteMapping("/remove-Compte/{Compte-id}")
			@ResponseBody																	 // Delete Compte
			public void removeCompte(@PathVariable("Compte-id") long Num_compt){
				CmpServ.deleteCompte(Num_compt);
			}
		//------------------------------------------------------------------------
			// http://localhost:8081/SpringMVC/servlet/modify-Compte

			@PutMapping("/modify-Compte")
			@ResponseBody                                                                  // Update Compte

			public Compte modifyCompte(@RequestBody Compte cp){
				
				return CmpServ.updateCompte(cp);
			}


			//-----------------------------------------------------------------------------

}
