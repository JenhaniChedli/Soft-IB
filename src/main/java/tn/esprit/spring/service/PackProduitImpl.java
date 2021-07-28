package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.PackProduit;
import tn.esprit.spring.repository.PackProduitRepository;
@Service
public class PackProduitImpl implements PackProduitService {
	private static final Logger LOG = org.apache.logging.log4j.LogManager.getLogger(PackProduitImpl.class);
	@Autowired
	private PackProduitRepository packProduitRepository;
	public List<PackProduit>retrieveALLPackProduit(){
		List<PackProduit>packProduits = (List<PackProduit>)packProduitRepository.findAll();
		for (PackProduit packProduit : packProduits){
			LOG.info("nom:"+packProduit.getNom()+"\n" +packProduit.getMarque()+"\n");
		}
		return packProduits;
		
	}
	@Override
	public PackProduit addPackProduit(PackProduit packProduit) {
		packProduitRepository.save(packProduit);
		return packProduit;
	}
	@Override
	public PackProduit updatePackProduit(PackProduit packProduit) {
		packProduitRepository.save(packProduit);
		return packProduit;
	}
	@Override
	public PackProduit deletePackProduit(Integer id) {
		packProduitRepository.deleteById(id);
		return null;
	}
	@Override
	public PackProduit retrievePackProduit(Integer id) {
		return packProduitRepository.findById(id).get();
	}
	

}
