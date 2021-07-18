package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="gestion_bank_class")
public class Banque implements Serializable  {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="bank_id")
	private int id; // Clé primaire
	private String siege,nom,adress;
	@Temporal(TemporalType.DATE)
	private Date DateDeCreation;
	private long NumTel;
	public Banque() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSiege() {
		return siege;
	}
	public void setSiege(String siege) {
		this.siege = siege;
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
	public Date getDateDeCreation() {
		return DateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		DateDeCreation = dateDeCreation;
	}
	public long getNumTel() {
		return NumTel;
	}
	public void setNumTel(long numTel) {
		NumTel = numTel;
	}
	@Override
	public String toString() {
		return "Banque [id=" + id + ", siege=" + siege + ", nom=" + nom + ", adress=" + adress + ", DateDeCreation="
				+ DateDeCreation + ", NumTel=" + NumTel + "]";
	}

}
