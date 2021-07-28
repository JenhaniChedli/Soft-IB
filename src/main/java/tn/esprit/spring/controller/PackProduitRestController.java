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

import tn.esprit.spring.entity.PackProduit;

import tn.esprit.spring.service.PackProduitService;
@RestController
public class PackProduitRestController {
	@Autowired
	PackProduitService packProduitService;

	@GetMapping("/retrieve-all-packProduits")
	@ResponseBody
	public List<PackProduit> retrieveALLPackProduit() {
		List<PackProduit> packProduits = packProduitService.retrieveALLPackProduit();
		return packProduits;
	}


	@PostMapping("/add-packProduit")
	@ResponseBody
	public PackProduit addPackProduit(@RequestBody PackProduit packProduit) {
		packProduitService.addPackProduit(packProduit);
		return packProduit;

	}
	

	@DeleteMapping("/delete-packProduit/{packProduit-id}")
	@ResponseBody
	public void removePackProduit(@PathVariable("packProduit-id") int packProduitId) {
		packProduitService.deletePackProduit(packProduitId);
	}

	@PutMapping("/modify-packProduit")
	@ResponseBody
	public PackProduit modifyPackProduit(@RequestBody PackProduit packProduit) {
		return packProduitService.updatePackProduit(packProduit);
	}

}