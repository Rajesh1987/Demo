package com.account.util;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

@Component
public class JsonUtils {

	private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

	public static String deSerialize(Object value) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			ObjectWriter writer = mapper.writer();
			return writer.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			logger.error("Error deserializing to json string of type :"+ value.getClass().getName());
		}

		return null;
	}

	public static <T>T serilize(String json, Class<T> type) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			ObjectReader reader = mapper.reader();
			return reader.readValue(json);
		} catch (IOException e) {
			logger.error("Error serializing json to object of type :"+ type.getClass().getName());
		}

		return null;

	}

}
