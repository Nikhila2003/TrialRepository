package org.nik.customerdatamanagement.repository;

import java.util.List;
import java.util.Optional;

import org.nik.customerdatamanagement.entity.CustomerEntity;
import org.nik.customerdatamanagement.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class PersonDAO {
	@Autowired
	public PersonRepository repository;
	 
	
	public Person savePerson(Person person) {
		return repository.save(person);
	}
	public Person updatePerson(Person person) {
		return repository.save(person);
		
	}
	public List<Person> getAllPersonsData(){
	return repository.findAll();
}
	public Person getPersonDataById(int id){
		return repository.findById(id).orElse(new Person());
}
	public List<Person> getPersonByName(String name){
		return repository.findByName(name);
		
	}
	public Person deletePersonById(int id) {
		Person person=getPersonDataById(id);
		if(person.getId()!=404) {
			repository.deletePersonById(id);
		}
		return person;
	}
	
	
	}
