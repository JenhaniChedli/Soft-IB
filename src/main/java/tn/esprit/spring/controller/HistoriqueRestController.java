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
import tn.esprit.spring.entity.Historique;
import tn.esprit.spring.service.HistoriqueService;

@Api( description="API pour les opérations CRUD sur les Hist.")
@RestController
public class HistoriqueRestController {
 
	@Autowired
	HistoriqueService HistServ;
	
	//------------------------------------------------------------------------
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Historiques
	
		@GetMapping("/retrieve-all-Historiques")
		@ResponseBody
		public List<Historique> getHistorique(){							//retrieve-all-Historique

		List<Historique> Hists = HistServ.retrieveALLHist();
		return Hists;

		}
	
	//------------------------------------------------------------------------
	
		  // http://localhost:8081/SpringMVC/servlet/retrieve-Historique/{Historique-id}
		
		@GetMapping("/retrieve-Historique/{Historique-id}")
		@ResponseBody														//retrieve Historique by ID
		public Historique retrieveHistorique(@PathVariable("Historique-id") long id){
			
		return HistServ.retrieveHistorique(id);
	    }


	//------------------------------------------------------------------------
		//add User : http://localhost:8081/SpringMVC/servlet/add-Historique

		@PostMapping("/add-Historique")												// Create Historique
		public Historique addHistorique(@RequestBody Historique Hist){
			HistServ.addHistorique(Hist);
			return Hist;
			
		}
	
	//------------------------------------------------------------------------
	
		// http://localhost:8081/SpringMVC/servlet/remove-Historique/{Historique-id}

		@DeleteMapping("/remove-Historique/{Historique-id}")
		@ResponseBody																	 // Delete Historique
		public void removeHistorique(@PathVariable("Historique-id") long id){
			HistServ.deleteHistorique(id);
		}
		
		//------------------------------------------------------------------------

		
		// http://localhost:8081/SpringMVC/servlet/modify-Historique

		@PutMapping("/modify-Historique")
		@ResponseBody                                                                  // Update Historique

		public Historique modifyHistorique(@RequestBody Historique Hist){
			
			return HistServ.updateHistorique(Hist);
		}


	
	//------------------------------------------------------------------------
}
