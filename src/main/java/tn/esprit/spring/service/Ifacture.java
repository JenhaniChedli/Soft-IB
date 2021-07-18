package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.facture;

public interface Ifacture {

	public List<facture> retrieveAllFacture();
	public facture retrieveFacture(int id);
	public void deleteFacture(int id);
	public facture updateFacture(facture fac);
	public facture add(facture fac);
}
