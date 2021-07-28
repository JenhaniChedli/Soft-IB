package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.credit;
import tn.esprit.spring.repository.creditRepository;

@Service
public class creditImpl implements Icredit {

	@Autowired
	creditRepository crdt;
	@Override
	public List<credit> retrieveAllCredit() {
		
		return (List<credit>)crdt.findAll();
	}

	@Override
	public credit retrieveCredit(int id) {
		
		return crdt.findById(id).get();
	}

	@Override
	public void deleteCredit(int id) {
		
		crdt.deleteById(id);
	}

	@Override
	public credit updateCredit(credit cred) {
		return crdt.save(cred);
	}

	@Override
	public credit add(credit cred) {
		
		return crdt.save(cred);
	}

}
