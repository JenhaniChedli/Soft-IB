package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Agence;


public interface Iagenceserv {
	public int addAgene(Agence agence);
	public List<Agence> retrieveAllAgence();
	public Agence retrieveAgence(int id);
	public void deleteAgence (int id);
	public Agence updateAgence(Agence agence);
	public int addOrUpdateAgence(Agence agence) ;
	public Agence add(Agence agence);
	//public Agence chercherParNom(String nom);

}
