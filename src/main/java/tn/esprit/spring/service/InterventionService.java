package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Intervention;

public interface InterventionService {
	public List<Intervention>retrieveALLUsers();
	public Intervention addIntervention(Intervention intervention);
	public Intervention updateIntervention(Intervention intervention);
	public Intervention deleteIntervention(Integer id);
	public Intervention retrieveIntervention(Integer id);

}
