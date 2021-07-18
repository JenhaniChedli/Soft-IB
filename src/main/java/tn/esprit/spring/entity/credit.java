package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class credit implements Serializable {	
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String periodociteDesEcheances,typeDamortissement;
@Temporal(TemporalType.DATE)
private Date   dureeChoisie, dateDe1erRemboursement;
private float  montant, taux;
@Enumerated(EnumType.STRING)
private TypeCredit type;
public credit() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPeriodociteDesEcheances() {
	return periodociteDesEcheances;
}
public void setPeriodociteDesEcheances(String periodociteDesEcheances) {
	this.periodociteDesEcheances = periodociteDesEcheances;
}
public String getTypeDamortissement() {
	return typeDamortissement;
}
public void setTypeDamortissement(String typeDamortissement) {
	this.typeDamortissement = typeDamortissement;
}
public Date getDureeChoisie() {
	return dureeChoisie;
}
public void setDureeChoisie(Date dureeChoisie) {
	this.dureeChoisie = dureeChoisie;
}
public Date getDateDe1erRemboursement() {
	return dateDe1erRemboursement;
}
public void setDateDe1erRemboursement(Date dateDe1erRemboursement) {
	this.dateDe1erRemboursement = dateDe1erRemboursement;
}
public float getMontant() {
	return montant;
}
public void setMontant(float montant) {
	this.montant = montant;
}
public float getTaux() {
	return taux;
}
public void setTaux(float taux) {
	this.taux = taux;
}
public TypeCredit getType() {
	return type;
}
public void setType(TypeCredit type) {
	this.type = type;
}
@Override
public String toString() {
	return "credit [id=" + id + ", periodociteDesEcheances=" + periodociteDesEcheances + ", typeDamortissement="
			+ typeDamortissement + ", dureeChoisie=" + dureeChoisie + ", dateDe1erRemboursement="
			+ dateDe1erRemboursement + ", montant=" + montant + ", taux=" + taux + ", type=" + type + "]";
}




}
