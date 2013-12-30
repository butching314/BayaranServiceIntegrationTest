package com.bayaran.service;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtils {
	private static final ObjectMapper OM = new ObjectMapper();
		
	public static String write(final Object value) {
		try {
			return OM.writeValueAsString(value);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
