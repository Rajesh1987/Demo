package com.udemy;

public class ProcessHandleTest {

	public static void main(String[] args) {
		
		ProcessHandle processHandle = ProcessHandle.current();
		System.out.println("process handle id : "+ processHandle.pid());
		
		ProcessHandle.Info info = processHandle.info();
		System.out.println("user : " + info.user());
		System.out.println("command : " + info.command().get());
		System.out.println("start instant : " + info.startInstant().get());
		System.out.println("total CPU duration : " + info.totalCpuDuration().get());
	}

}
