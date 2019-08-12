package com.account.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.account.error.ErrorResponse;
import com.account.exception.AccountDetailsBaseException;
import com.account.model.AccountDetailsResponse;

@ControllerAdvice
public class AccountControllerAdvice {
	
	@ExceptionHandler(AccountDetailsBaseException.class)
	public ResponseEntity<AccountDetailsResponse> handleAccountFoundException(AccountDetailsBaseException ex) {
		
		HttpStatus statusCode = ex.getStatusCode();
		
		AccountDetailsResponse response = new AccountDetailsResponse();
		
		if(null == statusCode) {
			statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		ErrorResponse errorResponse = new ErrorResponse(ex.getStatusCode().toString(),ex.getMsg(), Integer.toString(ex.getId()));
		
		response.setStatus("error");
		response.setData(errorResponse);
		
		ResponseEntity<AccountDetailsResponse> errorResposneEntity = new ResponseEntity<AccountDetailsResponse>(response, statusCode);
		
		return errorResposneEntity;
		
	}

}
