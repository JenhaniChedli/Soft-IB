package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Historique;

public interface HistoriqueService {
	
	 List<Historique>retrieveALLHist();
     Historique addHistorique(Historique historique);
     void deleteHistorique(long Ref_opr);
	 Historique updateHistorique(Historique historique);
	 Historique retrieveHistorique(long Ref_opr);
	 
	 
}
