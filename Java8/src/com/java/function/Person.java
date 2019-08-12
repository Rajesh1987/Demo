package com.java.function;

public class Person {
	
	private int personId;
	private String desc;
	
	
	public Person() {}
	
	public Person(int personId, String desc) {
		super();
		this.personId = personId;
		this.desc = desc;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
