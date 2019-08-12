package com.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.account.exception.AccountNotFoundException;
import com.account.model.AccountDetails;
import com.account.service.AccountDetailsService;
import com.account.service.AccountRepositoryService;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {
	
	@Autowired
	private AccountRepositoryService repositoryService;

	@Override
	public List<AccountDetails> retrieveAccount(int accId) {
			
		 List<AccountDetails> accDetails = repositoryService.retrieveByAccId(accId);
		
		 return accDetails;
	}

	@Override
	public List<AccountDetails> retrieveAccounts() {
		
		List<AccountDetails> accDetailsList = null;
		
		try {
			
			accDetailsList = repositoryService.findAll();
			
		}  catch(Exception ex) {
			
			throw new AccountNotFoundException("Exception occured while retrieving accounts list,"
					+ " so throwing internal server error"
									, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return accDetailsList;
	}

}
