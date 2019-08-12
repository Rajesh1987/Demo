package com.java.function;

public class Job {
	
	private int personId;
	private String jobDesc;
	
	
	
	public Job() {}
	
	public Job(int personId, String jobDesc) {
		super();
		this.personId = personId;
		this.jobDesc = jobDesc;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	
	

}
