package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/purchase")
public class PurchaseService {

	
	@GET
	@Path("/{product}")
	public Response purchase(@PathParam("product")String product) {
		String msg = "Purchasing product " + product;
		return Response.status(Response.Status.OK).entity(msg).build();
	}
}
