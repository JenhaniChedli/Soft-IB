package tn.esprit.spring.control;

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

import tn.esprit.spring.entity.Intervention;
import tn.esprit.spring.service.InterventionService;
@RestController
public class InterventionRestController {
	@Autowired
	InterventionService interventionService;

	@GetMapping("/retrieve-all-interventions")
	@ResponseBody
	public List<Intervention> retrieveALLIntervention() {
		List<Intervention> interventions = interventionService.retrieveALLUsers();
		return interventions;
	}

	@PostMapping("/add-intervention")
	@ResponseBody
	public Intervention addIntervention(@RequestBody Intervention intervention) {
		interventionService.addIntervention(intervention);
		return intervention;

	}

	@DeleteMapping("/delete-intervention/{intervention-id}")
	@ResponseBody
	public void removeIntervention(@PathVariable("intervention-id") int interventionId) {
		interventionService.deleteIntervention(interventionId);
	}

	@PutMapping("/modify-intervention")
	@ResponseBody
	public Intervention modifyIntervention(@RequestBody Intervention intervention) {
		return interventionService.updateIntervention(intervention);
	}

}
