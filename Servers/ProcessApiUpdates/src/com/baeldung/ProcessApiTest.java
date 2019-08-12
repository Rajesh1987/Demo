package com.baeldung;

import java.lang.ProcessHandle.Info;

public class ProcessApiTest {

	public static void main(String[] args) throws InterruptedException {
		
		ProcessHandle processHandle = ProcessHandle.current();
		System.out.println("process handle : "+ processHandle.pid());
		
		Info info = processHandle.info();
		
		System.out.println("Info : "+ info.command());
		
	

	}

}
