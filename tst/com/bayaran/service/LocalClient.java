package com.bayaran.service;

import java.net.URI;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class LocalClient {
	private final static String TEST_URL = "http://localhost:8888/BayaranService/rest";

	public static WebResource createResource() {
		Client client = Client.create();
		client.addFilter(new HTTPBasicAuthFilter("marvin", "marvin"));
		return client.resource(URI.create(TEST_URL));
	}
}
