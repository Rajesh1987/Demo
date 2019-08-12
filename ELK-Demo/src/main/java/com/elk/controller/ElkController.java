package com.elk.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ElkController {

	private static final Logger LOG = Logger.getLogger(ElkController.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/elkdemo")
	public String helloWorld() {

		String response = "Hello user ! " + new Date();

		LOG.log(Level.INFO, "  ELK Demo : helloworld - &gt; " + response);

		return response;
	}


	@RequestMapping(value = "/elk")
	public String helloWorld1() {

		String response = restTemplate.exchange("http://localhost:8080/elkdemo", HttpMethod.GET, null, String.class).getBody();

		LOG.log(Level.INFO, " / ELK demo : helloWorld1 method - &gt; " + response);

		try {
			String exceptionrsp = restTemplate.exchange("http://localhost:8080/exception", HttpMethod.GET, null, String.class).getBody();

			LOG.log(Level.INFO, "/elk trying to print exception - &gt; " + exceptionrsp);

			response = response + " === " + exceptionrsp;

		} catch (Exception e) {
			// exception should not reach here. Really bad practice :)
		}

		return response;
	}

	@RequestMapping(value = "/exception")
	public String exception() {
		String rsp = "";
		try {
			int i = 1 / 0;
			// should get exception
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e);

			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString(); // stack trace as a string
			LOG.error(" Exception As String :: - &gt; "+sStackTrace);

			rsp = sStackTrace;
		}

		return rsp;
	}
}
