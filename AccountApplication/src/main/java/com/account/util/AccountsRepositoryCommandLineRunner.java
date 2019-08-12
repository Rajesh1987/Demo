package com.account.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.account.model.AccountDetails;
import com.account.service.AccountRepositoryService;

/*
 * This class is used to load the values into the table during server start up
 */

@Component
public class AccountsRepositoryCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private AccountRepositoryService repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new AccountDetails(1, "PNC", "Savings"));
		repository.save(new AccountDetails(1, "BOA", "Checkings"));
		repository.save(new AccountDetails(2, "CITI", "Credit Card"));
		repository.save(new AccountDetails(3, "CHASE", "Home Loan"));
		
	}

}