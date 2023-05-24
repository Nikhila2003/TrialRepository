package org.nik.customerdatamanagement.service;

import java.util.List;

import org.nik.customerdatamanagement.entity.Person;
import org.nik.customerdatamanagement.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PersonService {
	@Autowired
	private PersonDAO dao;
	
	
	public Person savePerson(Person person) {
		return dao.savePerson(person);
	}
	public Person updatePerson(Person person) {
		return dao.savePerson(person);
	}
	public List<Person> getAllPersonsData(){
		return dao.getAllPersonsData();
		
	}
	public Person getPersonDataById(int id){
		return dao.getPersonDataById(id);
	}
	public List<Person> getPersonByName(String name){
		return dao.getPersonByName(name);
	}	
	public Person deletePersonById(int id){
		return dao.deletePersonById(id);
	}
}
