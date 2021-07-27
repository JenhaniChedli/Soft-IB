package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.facture;
import tn.esprit.spring.repository.factureRepository;

@Service
public class factureImpl implements Ifacture{
    @Autowired
    factureRepository fact;
	
	@Override
	public List<facture> retrieveAllFacture() {
		// TODO Auto-generated method stub
		return (List<facture>) fact.findAll();
	}

	@Override
	public facture retrieveFacture(int id) {
		// TODO Auto-generated method stub
		return fact.findById(id).get();
	}

	@Override
	public void deleteFacture(int id) {
		// TODO Auto-generated method stub
		fact.deleteById(id);
	}

	@Override
	public facture updateFacture(facture fac) {
		// TODO Auto-generated method stub
		return fact.save(fac);
	}


	@Override
	public facture add(facture fac) {
		// TODO Auto-generated method stub
		return fact.save(fac);
	}

}
