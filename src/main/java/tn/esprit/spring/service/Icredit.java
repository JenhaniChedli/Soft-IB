package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.credit;

public interface Icredit {

	public List<credit> retrieveAllCredit();
	public credit retrieveCredit(int id);
	public void deleteCredit(int id);
	public credit updateCredit(credit c);
	public credit add(credit c);
}