package com.example.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.example.ejb.PurchaseBean;

@Path("/purchase")
@Stateless
public class PurchaseService {
	@EJB private PurchaseBean purchaseBean;
	
	/**
	 * Purchase by ID where 'id' must be a digit.
	 * @param id
	 * @return
	 */
	@GET
	@Path("{id: \\d+}")
	public Response purchaseById(@PathParam("id") String id) {
		String msg = purchaseBean.purchaseById(id);
		return Response.status(Response.Status.OK).entity(msg).build();
	}
}
