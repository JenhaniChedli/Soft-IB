package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class PackProduit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String marque;
	
	@ManyToOne
	Banque banque;
	
	public PackProduit() {
		super();
	}
	public PackProduit(int id, String nom, String marque) {
		super();
		this.id = id;
		this.nom = nom;
		this.marque = marque;
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
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	@Override
	public String toString() {
		return "PackProduit [id=" + id + ", nom=" + nom + ", marque=" + marque + ", banque=" + banque + "]";
	}
	

}
