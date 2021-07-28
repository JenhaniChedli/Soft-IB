package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Clients")
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeClient;
	
	private String nomClient;
	private String adresseClient;
	@Enumerated(EnumType.STRING)
	private Type type;
	private boolean isActivated;
	private String namephoto;
	
	
	public Client(Long codeClient, String nomClient, String adresseClient, Type type,boolean isActivated) {
		super();
		this.codeClient = codeClient;
		this.nomClient = nomClient;
		this.adresseClient = adresseClient;
		this.type = type;
		this.isActivated = isActivated;
		this.namephoto="defaultuser.jpg";
	}
	
	public String getNamephoto() {
		return namephoto;
	}

	public void setNamephoto(String namephoto) {
		this.namephoto = namephoto;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public Client(Long codeClient, String nomClient, String adresseClient) {
		super();
		this.codeClient = codeClient;
		this.nomClient = nomClient;
		this.adresseClient = adresseClient;
	}
	public Client() {
		super();
	}
	public Long getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(Long codeClient) {
		this.codeClient = codeClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeClient == null) ? 0 : codeClient.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (codeClient == null) {
			if (other.codeClient != null)
				return false;
		} else if (!codeClient.equals(other.codeClient))
			return false;
		return true;
	}
	
	

}
