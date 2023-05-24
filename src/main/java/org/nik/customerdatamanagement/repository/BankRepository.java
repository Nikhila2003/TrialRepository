package org.nik.customerdatamanagement.repository;

import java.util.List;

import org.nik.customerdatamanagement.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends  JpaRepository<BankAccount , Integer>  {
	
	List<BankAccount> getByName(String name);
	List<BankAccount> deleteById(int id);
}
