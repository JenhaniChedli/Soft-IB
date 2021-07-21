package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Historique;
import tn.esprit.spring.repository.*;
@Service
public class HistoriqueServiceImp implements HistoriqueService{
	
	@Autowired
	HistoriqueRepository HistoriqueRepository;
	
	@Override
	public List<Historique> retrieveALLHist() {
		List<Historique>Hists =(List<Historique>)HistoriqueRepository.findAll();
		return Hists;
	}

	@Override
	public Historique addHistorique(Historique Historique) {
		HistoriqueRepository.save(Historique);
		return Historique;
	}

	@Override
	public void deleteHistorique(long Ref_opr) {
		HistoriqueRepository.deleteById(Ref_opr);
	}

	@Override
	public Historique updateHistorique(Historique Historique) {
		HistoriqueRepository.save(Historique);
		return Historique;
	}

	@Override
	public Historique retrieveHistorique(long Ref_opr) {
		return HistoriqueRepository.findById(Ref_opr).get();
	}

}
