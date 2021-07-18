package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Banque;


public interface Ibanque {
	public int addBanque(Banque banc);
	public List<Banque> retrieveAllBanque();
	public Banque retrieveBanque(int id);
	public void deleteBanque(int id);
	public Banque updateBanque(Banque banc);
	public int addOrUpdateBanque(Banque banc) ;
	public Banque add(Banque banc);
}
