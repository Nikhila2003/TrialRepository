package org.nik.customerdatamanagement.controller;

import java.util.List;

import org.nik.customerdatamanagement.dto.CustomerDto;
import org.nik.customerdatamanagement.dto.ResponseStructure;
import org.nik.customerdatamanagement.entity.CustomerEntity;
import org.nik.customerdatamanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private  CustomerService service;
	
	/*@PostMapping(value="/save")
	public @ResponseBody CustomerEntity saveCustomer(@RequestBody CustomerEntity customer) {
		return service.saveCustomer(customer);*/
	@PostMapping(value="/save")
	public @ResponseBody ResponseStructure<CustomerEntity> saveCustomer(@RequestBody CustomerDto dto) {
		return service.saveCustomer(dto);
	}
	@PutMapping("/customer")
	public @ResponseBody ResponseStructure<CustomerEntity> updateCustomer(CustomerEntity customer) {
		return service.updateCustomer(customer);
	}
	@GetMapping("/customer")
	public  @ResponseBody ResponseStructure<List<CustomerEntity>> getAllCustomerData(){
		return service.getAllCustomerData();
	}
	@GetMapping(value="/customer/{id}")
	public @ResponseBody CustomerEntity getCustomerDataById(@PathVariable("id")int id){
		return service.getCustomerDataById(id);
	}
	
	@GetMapping("/customerbyname/{name}")
	public List<CustomerEntity> getCustomerByName(@PathVariable String name){
	return service.getCustomerByName(name);
	}
	@PostMapping("/validateCustomer")
	public List<CustomerEntity> validateCustomer(@RequestParam("name")String name ,@RequestParam("email") String email){
		return service.validateCustomer(name, email);
	}
	
	@DeleteMapping("/customer")
	public  @ResponseBody  CustomerEntity deleteCustomerDataById(@RequestParam("id") int id) {
		return service.deleteCustomerDataById(id);
	}
	}
	

