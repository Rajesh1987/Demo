package com.spock;

import org.springframework.stereotype.Service;

@Service
public class SpockServiceImpl implements SpockService{

	@Override
	public String retrieveMessage() {
		return "Hello World in Spock..!! ";
	}

}
