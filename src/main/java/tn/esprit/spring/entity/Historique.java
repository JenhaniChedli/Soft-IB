package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Historique implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Ref_opr;
	private long Num_compt;
	private String client;
	private String type_opr;
	
	@Temporal(TemporalType.DATE)
	private Date Date_opr;
	
	private Double Montant_opr;
	
	public Historique() {
		super();
	}

	public Historique(long ref_opr, long num_compt, String client, String type_opr, Date date_opr, Double montant_opr) {
		super();
		Ref_opr = ref_opr;
		Num_compt = num_compt;
		this.client = client;
		this.type_opr = type_opr;
		Date_opr = date_opr;
		Montant_opr = montant_opr;
	}

	public long getRef_opr() {
		return Ref_opr;
	}

	public void setRef_opr(long ref_opr) {
		Ref_opr = ref_opr;
	}

	public long getNum_compt() {
		return Num_compt;
	}

	public void setNum_compt(long num_compt) {
		Num_compt = num_compt;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getType_opr() {
		return type_opr;
	}

	public void setType_opr(String type_opr) {
		this.type_opr = type_opr;
	}

	public Date getDate_opr() {
		return Date_opr;
	}

	public void setDate_opr(Date date_opr) {
		Date_opr = date_opr;
	}

	public Double getMontant_opr() {
		return Montant_opr;
	}

	public void setMontant_opr(Double montant_opr) {
		Montant_opr = montant_opr;
	}
	
	
	
    
}
