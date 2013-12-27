package main.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {
	public HelloWorld(){
	}
	
	@GET
	public Response getMsg() {
		String output = "test data";
		return Response.status(200).entity(output).build();
	}
}
