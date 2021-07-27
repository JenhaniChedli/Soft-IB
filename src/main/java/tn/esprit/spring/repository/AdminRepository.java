package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Admin;


@Repository
public interface AdminRepository extends CrudRepository<Admin, Long>  {

}
