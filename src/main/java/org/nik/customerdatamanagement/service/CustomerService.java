package org.nik.customerdatamanagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.nik.customerdatamanagement.dto.CustomerDto;
import org.nik.customerdatamanagement.dto.ResponseStructure;
import org.nik.customerdatamanagement.entity.CustomerEntity;
import org.nik.customerdatamanagement.repository.CustomerDAO;
import org.nik.customerdatamanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {
	
    //@Autowired
	//private CustomerRepository repository;
	@Autowired
	private CustomerDAO dao;
	public CustomerEntity saveCustomer(CustomerEntity customer) {	
		return dao.save(customer);
       //public CustomerEntity saveCustomer(CustomerEntity customer) {
		
		//return repository.save(customer);
	}
	public ResponseStructure<CustomerEntity> updateCustomer(CustomerEntity customer) {
		 CustomerEntity cus= dao.saveCustomer(customer);
		 ResponseStructure<CustomerEntity> rs=new ResponseStructure<>();
		 rs.setData(cus);
		 rs.setStatusCode(HttpStatus.ACCEPTED.value());
		 rs.setTimestamp(LocalDateTime.now());
		 rs.setMessage(HttpStatus.ACCEPTED.name());
		 return rs;
	 }
	
	/*public CustomerEntity updateCustomer(CustomerEntity customer) {
		return dao.saveCustomer(customer);
	}*/
	
	public ResponseStructure<List<CustomerEntity>> getAllCustomerData(){
		List<CustomerEntity> list=dao.getAllCustomerData();
		ResponseStructure<List<CustomerEntity>> rs=new ResponseStructure();
		if(list.size()!=0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimestamp(LocalDateTime.now());
			rs.setMessage("no customer entr found in database");
		}else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(list);
			rs.setTimestamp(LocalDateTime.now());
			rs.setMessage("no customer entry found in database");
		}
		return rs;
	}
	public ResponseStructure<CustomerEntity> saveCustomer(CustomerDto dto) {
		CustomerEntity cus=new CustomerEntity(dto);
		CustomerEntity customer=dao.saveCustomer(cus);
		ResponseStructure<CustomerEntity> rs=new ResponseStructure<>();
		rs.setData(customer);
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("Customer data saved successfully");
		rs.setTimestamp(LocalDateTime.now());
		return rs;
	}
	
	/*public List<CustomerEntity> getAllCustomerData() {
		return dao.getAllCustomerData();
	}*/
	public CustomerEntity getCustomerDataById(int id) {
		return dao.getCustomerDataById(id);
	}
	public CustomerEntity deleteCustomerDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}

	public List<CustomerEntity> getCustomerByName(String name){
	return dao.getCustomerByName(name);
}
	public List<CustomerEntity> validateCustomer(String name , String email){
		return dao.validateCustomer(name, email);
	}
}
