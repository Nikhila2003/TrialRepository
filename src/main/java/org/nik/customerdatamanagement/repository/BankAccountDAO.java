package org.nik.customerdatamanagement.repository;

import java.util.List;

import org.nik.customerdatamanagement.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountDAO {
	@Autowired
	private BankRepository repository;
	
	public List<BankAccount> getByBankName(String name){
		return repository.getByName(name);
	}
	public BankAccount getByBankId(int id) {
		return repository.findById(id).orElse(new BankAccount());
	}
	
	public BankAccount deleteByBankId(int id) {
		 BankAccount account = getByBankId(id);
		 if(account!=null){
			 repository.deleteById(id);
		 }
		return account;
	}

	public List<BankAccount> getAll() {
		return repository.findAll();
	}
}

