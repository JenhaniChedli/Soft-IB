package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Compte;
import tn.esprit.spring.repository.*;
@Service
public class CompteServiceImp implements CompteService {
 
	@Autowired
	CompteRepository CompteRepository;
	
	@Override
	public List<Compte> retrieveALLCompte() {
		List<Compte>cps = (List<Compte>)CompteRepository.findAll();
		return cps;
	}

	@Override
	public Compte addCompte(Compte cp) {
		CompteRepository.save(cp);
		return cp;
	}

	@Override
	public void deleteCompte(long Num_compt) {
		CompteRepository.deleteById(Num_compt);
	}

	@Override
	public Compte updateCompte(Compte cp) {
		CompteRepository.save(cp);
		return cp;
	}

	@Override
	public Compte retrieveCompte(long Num_compt) {
		return CompteRepository.findById(Num_compt).get();
	}

}
