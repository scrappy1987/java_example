package com.qa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.qa.model.Account;

@Repository("accountRepository")
public class HibernateAccountRepositoryImpl implements AccountRepository {
	
	@Override
	public List<Account> findAll() {
		List<Account> accounts = new ArrayList<>();
		
		Account account = new Account();
		
		account.setFirstname("John");
		account.setLastname("Gordon");
		
		accounts.add(account);
		
		return accounts;
	}
}
