package com.shipeng.bidder.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/bid")
public class BidRequestHandler {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "My jersery bidder say : " + msg;

		return Response.status(200).entity(output).build();

	}

}
