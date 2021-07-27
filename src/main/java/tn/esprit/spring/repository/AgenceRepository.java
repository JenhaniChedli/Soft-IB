package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Agence;
@Repository
public interface AgenceRepository extends CrudRepository<Agence, Integer>{
  
}
