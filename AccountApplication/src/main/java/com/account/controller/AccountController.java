package com.account.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.mapper.AccountDetailsMapper;
import com.account.model.AccountDetails;
import com.account.model.AccountDetailsResponse;
import com.account.model.AccountsResponse;
import com.account.service.AccountDetailsService;
import com.account.util.JsonUtils;

@RestController
public class AccountController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private AccountDetailsService service;
	
	@Autowired
	private AccountDetailsMapper mapper;
	
	@GetMapping(value = "/accounts")
	public ResponseEntity<AccountDetailsResponse> retrieveAccounts() {
		
		final String source = "./retrieveAccounts";
		
		AccountDetailsResponse response = new AccountDetailsResponse();
		
		List<AccountDetails> accountDetailsList = service.retrieveAccounts();
		
		logger.debug(source + "user details list : "+ JsonUtils.deSerialize(accountDetailsList));
		
		List<AccountsResponse> accResponse = mapper.mapToAccountsResponse(accountDetailsList);
		
		response.setStatus("success");
		response.setData(accResponse);
		
		ResponseEntity<AccountDetailsResponse> userDetailsListEntity = new ResponseEntity<AccountDetailsResponse>(response, HttpStatus.OK);
		
		return userDetailsListEntity;
		
	}
	
	@GetMapping(value = "/accounts/{accId}")
	public ResponseEntity<AccountDetailsResponse> retrieveAccount(@PathVariable("accId") Integer accId) {
		
		final String source = "./retrieveAccount";
		
		AccountDetailsResponse response = new AccountDetailsResponse();
		
		 List<AccountDetails> accDetailsList = service.retrieveAccount(accId);
		 
		 logger.debug(source + "user details list : "+ JsonUtils.deSerialize(accDetailsList));
		 
		 List<AccountsResponse> accResponse = mapper.mapToAccountsResponse(accDetailsList);
		
		 response.setStatus("success");
		 response.setData(accResponse);
		 
		ResponseEntity<AccountDetailsResponse> accDetailsListEntity = new ResponseEntity<AccountDetailsResponse>(response, HttpStatus.OK);
		
		return accDetailsListEntity;
		
	}
	

	


}
