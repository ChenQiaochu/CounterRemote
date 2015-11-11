package com.inno.counter;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/counter")
public class Counter {

	int counter;
	
	public void init(){
		counter =0;
	}
	
	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String plainTextHello(String name){
			counter +=1;
			System.out.println(counter);
		return "Hello,counter is called";
		
	}
	
	@Path("/value")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String plainTextNo(){
		return "value:" + counter;
	}
	
	
	@Path("/message")
	@GET
	public Response getMsg(String msg){
		return Response.status(200).entity("Welcome").build();
	}
	
	public void test(){
		System.out.println("Test for it!");
	}

}
