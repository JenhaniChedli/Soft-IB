package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Admins")
	
public class Admin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeAdmin;
	@Column(unique=true)
	private String nomAdmin;
	@Column(unique=true)
	private String email;
	private String password;
	private boolean isLogged;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Client> Clients;
	
	public Set<Client> getClients() {
		return Clients;
	}
	public void setClients(Set<Client> clients) {
		Clients = clients;
	}
	public Admin(Long codeAdmin, String nomAdmin,String email, String password, boolean isLogged) {
		super();
		this.codeAdmin = codeAdmin;
		this.nomAdmin = nomAdmin;
		this.email = email;
		this.password = password;
		this.isLogged = isLogged;
	}
	public Admin() {
		super();
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCodeAdmin() {
		return codeAdmin;
	}
	public void setCodeAdmin(Long codeAdmin) {
		this.codeAdmin = codeAdmin;
	}
	public String getNomAdmin() {
		return nomAdmin;
	}
	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}
	public String getPassword() {
		 String aCrypter="";
	        for (int i=0; i<password.length();i++)  {
	            int c=password.charAt(i)^48; 
	            aCrypter=aCrypter+(char)c;
	        }
	        return aCrypter;
	}
	public void setPassword(String password) {
		 String crypte="";
	    for (int i=0; i<password.length();i++)  {
            int c=password.charAt(i)^48; 
            crypte=crypte+(char)c;
        }
		this.password = crypte;
	}
	public boolean isLogged() {
		return isLogged;
	}
	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeAdmin == null) ? 0 : codeAdmin.hashCode());
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
		Admin other = (Admin) obj;
		if (codeAdmin == null) {
			if (other.codeAdmin != null)
				return false;
		} else if (!codeAdmin.equals(other.codeAdmin))
			return false;
		return true;
	}
	
	

}
