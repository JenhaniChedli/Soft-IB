package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.credit;
import tn.esprit.spring.repository.creditRepository;

public class creditImpl implements Icredit {

	@Autowired
	creditRepository crdt;
	@Override
	public List<credit> retrieveAllCredit() {
		// TODO Auto-generated method stub
		return (List<credit>)crdt.findAll();
	}

	@Override
	public credit retrieveCredit(int id) {
		// TODO Auto-generated method stub
		return crdt.findById(id).get();
	}

	@Override
	public void deleteCredit(int id) {
		// TODO Auto-generated method stub
		crdt.deleteById(id);
	}

	@Override
	public credit updateCredit(credit cred) {
		// TODO Auto-generated method stub
		return crdt.save(cred);
	}

	@Override
	public credit add(credit cred) {
		// TODO Auto-generated method stub
		return crdt.save(cred);
	}

}
