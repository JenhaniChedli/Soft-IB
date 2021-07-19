package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Agence;
import tn.esprit.spring.repository.AgenceRepository;

@Service
public class agenceImpl implements  Iagenceserv{

	@Autowired
	AgenceRepository agenRepo;
	
	@SuppressWarnings("unused")
	private static final Logger l = LogManager.getLogger(agenceImpl.class);
	@Override
	public int addAgene(Agence agence) {
		
		return agenRepo.save(agence).getId();
	}

	@Override
	public List<Agence> retrieveAllAgence() {
		List<Agence> agences=(List<Agence>)agenRepo.findAll();
		
		return agences;
	}

	@Override
	public Agence retrieveAgence(int id) {
		return agenRepo.findById(id).get();
	}

	@Override
	public void deleteAgence(int id) {
      agenRepo.deleteById(id);		
	}

	@Override
	public Agence updateAgence(Agence agence) {
    return agenRepo.save(agence);		
	}

	@Override
	public int addOrUpdateAgence(Agence agence) {
		agenRepo.save(agence);
		return agence.getId();
	}

	@Override
	public Agence add(Agence agence) {
		// TODO Auto-generated method stub
		return agenRepo.save(agence);
	}

}
