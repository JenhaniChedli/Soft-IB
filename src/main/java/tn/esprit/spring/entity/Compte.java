package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Num_compt;
	private String type_compt;
	@Temporal(TemporalType.DATE)
	private Date Date_Creation;
	private boolean etat_compt;
	private String client;
	private double solde_actuel;
	
	@ManyToOne
	Client clients;

	@OneToOne
	Historique historique;
	
	@ManyToOne
	Banque banque;
	
	public Compte() {
		super();
	}

	public Compte(int num_compt, String type_compt, boolean etat_compt, String client, float solde_actuel, Date Date_Creation) {
		super();
		Num_compt = num_compt;
		this.type_compt = type_compt;
		//@Temporal(TemporalType.DATE)
		this.Date_Creation =Date_Creation;
		this.etat_compt = etat_compt;
		this.client = client;
		this.solde_actuel = solde_actuel;
	}

	public long getNum_compt() {
		return Num_compt;
	}

	public void setNum_compt(long num_compt) {
		Num_compt = num_compt;
	}

	public String getType_compt() {
		return type_compt;
	}

	public void setType_compt(String type_compt) {
		this.type_compt = type_compt;
	}

	public Date getDate_Creation() {
		return Date_Creation;
	}

	public void setDate_Creation(Date date_Creation) {
		Date_Creation = date_Creation;
	}

	public boolean isEtat_compt() {
		return etat_compt;
	}

	public void setEtat_compt(boolean etat_compt) {
		this.etat_compt = etat_compt;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public double getSolde_actuel() {
		return solde_actuel;
	}

	public void setSolde_actuel(double solde_actuel) {
		this.solde_actuel = solde_actuel;
	}

	public Client getClients() {
		return clients;
	}

	public void setClients(Client clients) {
		this.clients = clients;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	
	
	
	

}
