package com.account.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.account.model.AccountDetails;

public interface AccountDetailsService {
	
	public List<AccountDetails> retrieveAccount(int id);
	
	public List<AccountDetails> retrieveAccounts();

}
