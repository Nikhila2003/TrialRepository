package org.nik.customerdatamanagement.repository;

import java.util.List;

import org.nik.customerdatamanagement.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {

	@Autowired
	public CustomerRepository repository;
	
	 public CustomerEntity saveCustomer(CustomerEntity customerentity){
		return repository.save(customerentity);
	}
	 
	 
	 public List<CustomerEntity> getAllCustomerData() {
			return 	repository.findAll();
			}
			public CustomerEntity getCustomerDataById(int id) {
				 return repository.findById(id).orElse(new CustomerEntity(null));
						 
			}
			public CustomerEntity deleteCustomerDataById(int id) {
				CustomerEntity customer = getCustomerDataById(id);
				if(customer.getId()!=404) {
					repository.deleteById(id);
				}
				return customer;
			}
			public List<CustomerEntity> getCustomerByName(String name){
			return repository.findByName(name);
			}

			public CustomerEntity save(CustomerEntity customer) {
				
				return null;
			}
			public  List<CustomerEntity> validateCustomer(String name , String email){
				return repository.validateCustomer(name, email);
			}
}
