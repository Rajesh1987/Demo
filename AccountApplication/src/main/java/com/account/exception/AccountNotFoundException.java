package com.account.exception;

import org.springframework.http.HttpStatus;

public class AccountNotFoundException extends AccountDetailsBaseException {

	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(String message, int id) {
		super(message, id);
	}
	
	public AccountNotFoundException(String message, int id, HttpStatus statusCode) {
		super(message, id, statusCode);
	}
	
	public AccountNotFoundException(String message, HttpStatus statusCode) {
		super(message, statusCode);
	}

}
