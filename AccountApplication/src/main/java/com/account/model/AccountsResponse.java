package com.account.model;

public class AccountsResponse {
	
	private Integer id;
	private Integer accId;
	private String bankName;
	private String accountType;
	
	public AccountsResponse() {}
	
	public AccountsResponse(Integer id, Integer accId, String bankName, String accountType) {
		super();
		this.id = id;
		this.accId = accId;
		this.bankName = bankName;
		this.accountType = accountType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	

}
