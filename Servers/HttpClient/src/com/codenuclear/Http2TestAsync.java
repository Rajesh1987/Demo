package com.codenuclear;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class Http2TestAsync {

	public static void main(String[] args) throws IOException {
	
		try {
			HttpClient httpClient = HttpClient.newHttpClient();
			
			HttpRequest httpRequest =  HttpRequest.newBuilder().uri(new URI("http://www.codenuclear.com")).GET().build();
			
			System.out.println("Calling...");
			
			//CompletableFuture<HttpResponse<String>> asyncResponse = httpClient.sendAsync(httpRequest, HttpResponse.BodyHandler.asString());
			 CompletableFuture<HttpResponse<String>> asyncResponse = httpClient.sendAsync(httpRequest, HttpResponse.BodyHandler.asString()); //Send the request asynchronously
			System.out.println("performing other tasks");
			//System.out.println(" Response is : "+ asyncResponse.get().statusCode());
			asyncResponse.get(2L, TimeUnit.SECONDS);
			if(asyncResponse.isDone()) {
				System.out.println("in if");
				System.out.println(" Response is : "+ asyncResponse.get().statusCode());
			}else {
				System.out.println("in else");
				asyncResponse.cancel(true);
            }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	

	}

}
