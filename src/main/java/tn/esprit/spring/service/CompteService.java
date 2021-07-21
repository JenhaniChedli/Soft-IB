package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Compte;

public interface CompteService {
	
	 List<Compte>retrieveALLCompte();
	 Compte addCompte(Compte cp);
	 void deleteCompte(long Num_compt);
	 Compte updateCompte(Compte cp);
	 Compte retrieveCompte(long Num_compt);
	 
}
