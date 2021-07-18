package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="gestion_agence")
public class Agence implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="agence_id")
	private int id;
	private String nom,adress,ChefDagence;
	@Temporal(TemporalType.DATE)
	private Date dateDeCreation;
	private float NumTel;
	public Agence() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getChefDagence() {
		return ChefDagence;
	}
	public void setChefDagence(String chefDagence) {
		ChefDagence = chefDagence;
	}
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public float getNumTel() {
		return NumTel;
	}
	public void setNumTel(float numTel) {
		NumTel = numTel;
	}
	@Override
	public String toString() {
		return "Agence [id=" + id + ", nom=" + nom + ", adress=" + adress + ", ChefDagence=" + ChefDagence
				+ ", dateDeCreation=" + dateDeCreation + ", NumTel=" + NumTel + "]";
	}
	
	
	
}
	
