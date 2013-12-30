package com.bayaran.service;

import java.math.BigDecimal;
import java.util.Date;

import javax.ws.rs.core.MediaType;

import junit.framework.Assert;

import org.junit.Test;

import com.bayaran.domain.Expense;
import com.bayaran.domain.User;
import com.sun.jersey.api.client.ClientResponse;

public class ExpenseTest {
	@Test
	public void testDumbQuery() {
		final ClientResponse response = LocalClient.createResource().path("expenses")
				.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		Assert.assertEquals(200, response.getStatus());
	}
	
	@Test
	public void testSampleInsert() {
		final User user = new User();
		user.setUserId("marvinTest");
		
		final Expense expense = new Expense();
		expense.setAmount(BigDecimal.valueOf(12));
		expense.setDescription("description");
		expense.setStore("store");
		expense.setRemark("remark");
		expense.setTrxDate(new Date());
		expense.setPayor(user);
		
		final ClientResponse response = LocalClient.createResource().path("expenses")
				.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, JsonUtils.write(expense));
		
		System.out.println( response.getStatus());
		System.out.println(response.getEntity(String.class));
	}
}
