package org.javabrains.service;

import java.util.ArrayList;
import java.util.List;

import org.javabrains.model.Message;

public class MessageService {
	
	public List<Message> getMessagesList() {
		
		List<Message> msgList = new ArrayList<>();
		msgList.add(new Message("Java", "Rajesh"));
		msgList.add(new Message("Spring Boot", "Guru"));
		msgList.add(new Message("Angular", "Nani"));
		
		return msgList;
	}

}
