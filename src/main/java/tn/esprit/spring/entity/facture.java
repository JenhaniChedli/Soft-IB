package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;



@Entity
public class facture implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
	private String ref_facture, recept;
	private Date date;
	private float montant;
	
	
	//@ManyToOne
	//Client client;
	
	public facture() {
		super();
	}
	
	
	public facture(int id, String ref_facture, String recept, Date date, float montant) {
		super();
		this.id = id;
		this.ref_facture = ref_facture;
		this.recept = recept;
		this.date = date;
		this.montant = montant;
	}


	public String getRef_facture() {
		return ref_facture;
	}
	public void setRef_facture(String ref_facture) {
		this.ref_facture = ref_facture;
	}
	public String getRecept() {
		return recept;
	}
	public void setRecept(String recept) {
		this.recept = recept;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	@Override
	public String toString() {
		return "facture [ref_facture=" + ref_facture + ", recept=" + recept + ", date=" + date + ", montant=" + montant
				+ "]";
	}

	
} 
	
	


