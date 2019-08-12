package com.account.error;

public class ErrorResponse {
	
	private String errorCode;
	private String errorMsg;
	private String errorDesc;
	
	public ErrorResponse() {}
	
	public ErrorResponse(String errorCode, String errorMsg, String errorDesc) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.errorDesc = errorDesc;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

}
