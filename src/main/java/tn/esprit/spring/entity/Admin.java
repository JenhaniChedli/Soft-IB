package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String nomAdmin;
	private String password;
	private boolean isLogged;
	public Admin(Long codeAdmin, String nomAdmin, String password, boolean isLogged) {
		super();
		this.codeAdmin = codeAdmin;
		this.nomAdmin = nomAdmin;
		this.password = password;
		this.isLogged = isLogged;
	}
	public Admin() {
		super();
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
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
