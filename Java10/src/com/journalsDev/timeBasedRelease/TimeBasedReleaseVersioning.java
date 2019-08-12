package com.journalsDev.timeBasedRelease;

import java.lang.Runtime.Version;

public class TimeBasedReleaseVersioning {

	public static void main(String[] args) {
		
		Version version = Runtime.version();
		System.out.println("feature : "+ version.feature());
		System.out.println("interim : "+version.interim());
		System.out.println("update :" +version.update());
		System.out.println("patch :"+version.patch());

	}

}
