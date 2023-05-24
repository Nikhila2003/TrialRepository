package org.nik.customerdatamanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="BankAcount")
public class BankAccount implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_id")
	private Integer pid;
	
	//@Column(name="name")
	private String name;
	
	@Column(name="account-number")
	private Long accountNumber;

	
	@ManyToOne
	@JoinColumn(name="person")
	private Person person;
	
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [pid=" + pid + ", name=" + name + ", accountNumber=" + accountNumber + "]";
	}
	
}
