package tn.esprit.spring.entity;


import java.io.Serializable;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
@Entity
public class Intervention implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="interventionid")
	private int id;
	
	
	//@ManyToMany(mappedBy = "intervention")
	//private Set<Client> clients;

	@Enumerated(EnumType.ORDINAL)
	private TypeIntervention typeIntervention;
	
	
	//public Set<Client> getClients() {
	//	return clients;
	//}
	//public void setClients(Set<Client> clients) {
	//	this.clients = clients;
	//}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TypeIntervention getTypeIntervention() {
		return typeIntervention;
	}
	public void setTypeIntervention(TypeIntervention typeIntervention) {
		this.typeIntervention = typeIntervention;
	}

}


