package com.bayaran.service;

import javax.ws.rs.core.MediaType;

import junit.framework.Assert;

import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;

public class UserTest {
	@Test
	public void runTest() {
		final ClientResponse response = LocalClient.createResource().path("users")
				.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		Assert.assertEquals(200, response.getStatus());
	}
}
