package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Intervention;
import tn.esprit.spring.repository.InterventionRepository;
@Service
public class InterventionServiceImpl implements InterventionService  {
	private static final Logger LOG = org.apache.logging.log4j.LogManager.getLogger(InterventionServiceImpl.class);
	@Autowired
	private InterventionRepository interventionRepository;
	public List<Intervention>retrieveALLUsers(){
		List<Intervention>interventions =(List<Intervention>)interventionRepository.findAll();
		for (Intervention intervention : interventions){
			LOG.info("usename:"+intervention.getId()+"\n");
		}
		return interventions;
	}
	@Override
	public Intervention addIntervention(Intervention intervention) {
		interventionRepository.save(intervention);
		return intervention;
	}
	@Override
	public Intervention updateIntervention(Intervention intervention) {
		interventionRepository.save(intervention);
		return intervention;
	}
	@Override
	public Intervention deleteIntervention(Integer id) {
		interventionRepository.deleteById(id);
		return null;
	}
	@Override
	public Intervention retrieveIntervention(Integer id) {
		return interventionRepository.findById(id).get();
	}

}
