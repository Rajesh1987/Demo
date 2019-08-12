package com.account.exception;

import org.springframework.http.HttpStatus;

import com.account.error.ErrorResponse;

public class AccountDetailsBaseException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private ErrorResponse errorResponse = new ErrorResponse() ;
	private HttpStatus statusCode;
	private String msg;
	private int id;
	
	public AccountDetailsBaseException(String msg, int id) {
		super();
		this.msg = msg;
		this.id = id;
	}
	
	public AccountDetailsBaseException(String msg, int id, HttpStatus statusCode) {
		super();
		this.msg = msg;
		this.id = id;
		this.statusCode = statusCode;
	}
	
	public AccountDetailsBaseException(String msg, HttpStatus statusCode) {
		super();
		this.msg = msg;
		this.statusCode = statusCode;
	}
	
	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}
	public void setErrorResponse(ErrorResponse errorResponse) {
		this.errorResponse = errorResponse;
	}
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
