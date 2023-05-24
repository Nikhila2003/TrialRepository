package org.nik.customerdatamanagement.repository;

import java.util.List;
import org.nik.customerdatamanagement.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository  extends JpaRepository<CustomerEntity, Integer>{
	
	public List<CustomerEntity>findByName(String name);
	
	@Query("SELECT c FROM CustomerEntity c WHERE c.name =:name AND c.email =:email")
	public List<CustomerEntity> validateCustomer(@Param("name") String name , @Param("email")String email);
		
	}
	


