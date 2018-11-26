package com.qa.repository;

import java.util.List;

import com.qa.model.Account;

public interface AccountRepository {

	List<Account> findAll();

}