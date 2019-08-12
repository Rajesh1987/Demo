package com.codenuclear;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class Http2Test {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
	
		HttpClient httpClient = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder().uri(new URI("http://www.codenuclear.com")).GET().build();
		
		HttpResponse<String> httpResponse = httpClient.send(request, HttpResponse.BodyHandler.asString());
		
		System.out.println("Http response : "+ httpResponse.statusCode());
		

	}

}
