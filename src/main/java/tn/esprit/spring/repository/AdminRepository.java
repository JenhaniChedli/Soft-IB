package tn.esprit.spring.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Admin;


@Repository
public interface AdminRepository extends CrudRepository<Admin, Long>  {
	
	@Query("Select u from Admin u where u.email = :email")
	public Admin findByEmail (@Param("email")String email);
	
	@Query("Select u from Admin u where u.nomAdmin = :nomAdmin and u.password = :password")
	public Admin Login (@Param("nomAdmin")String nomAdmin,@Param("password")String password);
	
	@Query("Select count(u) from Admin u where u.isLogged = true ")
	public int countLogin ();
}
