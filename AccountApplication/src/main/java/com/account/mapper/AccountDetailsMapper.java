package com.account.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.account.model.AccountDetails;
import com.account.model.AccountsResponse;

@Component
public class AccountDetailsMapper {
	
	public List<AccountsResponse> mapToAccountsResponse(List<AccountDetails> accountDetailsList) {
		
		return accountDetailsList.stream().map(
				accList -> new AccountsResponse(accList.getId(), accList.getAccId(),
						accList.getBankName(), accList.getAccountType()))
		.collect(Collectors.toList());
	}

}
