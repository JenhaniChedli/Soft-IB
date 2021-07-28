package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.PackProduit;

public interface PackProduitService {
	public List<PackProduit>retrieveALLPackProduit();
	public PackProduit addPackProduit(PackProduit p_Produit);
	public PackProduit updatePackProduit(PackProduit p_Produit);
	public PackProduit deletePackProduit(Integer id);
	public PackProduit retrievePackProduit(Integer id);

}
