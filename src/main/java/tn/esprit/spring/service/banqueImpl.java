package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Banque;
import tn.esprit.spring.repository.BanqueRepository;

@Service
public class banqueImpl implements Ibanque{
    @Autowired
    BanqueRepository bank;
	@Override
	public int addBanque(Banque banc) {
		// TODO Auto-generated method stub
		return bank.save(banc).getId();
	}

	@Override
	public List<Banque> retrieveAllBanque() {
	 List<Banque>banqs=(List<Banque>)bank.findAll();
    return banqs;
	}

	@Override
	public Banque retrieveBanque(int id) {
		return bank.findById(id).get();
	}

	@Override
	public void deleteBanque(int id) {
		bank.deleteById(id);
		
	}

	@Override
	public Banque updateBanque(Banque banc) {
     return bank.save(banc);		
	}

	@Override
	public int addOrUpdateBanque(Banque banc) {
		// TODO Auto-generated method stub
		return  bank.save(banc).getId();
	}

	@Override
	public Banque add(Banque banc) {
		// TODO Auto-generated method stub
		return bank.save(banc);
	}
	

}
