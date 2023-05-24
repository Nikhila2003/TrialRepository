package org.nik.customerdatamanagement.repository;

import java.util.List;

import org.nik.customerdatamanagement.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer>  {

	List<Person> findByName(String name);

	void deletePersonById(int id);

	

}
