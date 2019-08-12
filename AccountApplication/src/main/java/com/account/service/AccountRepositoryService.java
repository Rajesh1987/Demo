package com.account.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.account.model.AccountDetails;

public interface AccountRepositoryService extends JpaRepository<AccountDetails, Integer> {
	
	@Query("select a from AccountDetails a  where a.accId = ?1")
	List<AccountDetails> retrieveByAccId(Integer accId);

}
