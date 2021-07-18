package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Admin;

public interface IAdmin {
	 List<Admin> retrieveAllAdmins();
	 Admin addAdmin(Admin a);
	 void deleteAdmin(Long id);
	 Admin updateAdmin(Admin a);
	 Admin retrieveAdmin(Long id);
}
