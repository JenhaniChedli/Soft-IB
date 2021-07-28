package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.repository.AdminRepository;

@Service
public class AdminService implements IAdmin{

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public List<Admin> retrieveAllAdmins() {
		List<Admin> admins=(List<Admin>)adminRepository.findAll();
		return admins;
	}

	@Override
	public Admin addAdmin(Admin a) {
		adminRepository.save(a);
		 return a;
	}

	@Override
	public void deleteAdmin(Long id) {
		adminRepository.deleteById(id);
		
	}

	@Override
	public Admin updateAdmin(Admin a) {
		 adminRepository.save(a);
		 return a;
	}

	@Override
	public Admin retrieveAdmin(Long id) {
		return adminRepository.findById(id).get();
	}

	@Override
	public Admin login(String nomAdmin, String password) {		
		return adminRepository.Login(nomAdmin, password);
	}

	@Override
	public int countlogin() {		
		return adminRepository.countLogin();
	}

	@Override
	public Admin getAdminByEmail(String email) {
		return adminRepository.findByEmail(email);
			
	}

}
