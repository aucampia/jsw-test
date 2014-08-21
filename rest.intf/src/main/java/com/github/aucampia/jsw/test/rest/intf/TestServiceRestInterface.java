package com.github.aucampia.jsw.test.rest.intf;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/test_service")
public interface TestServiceRestInterface
{
	@GET
	@Path("/info/{id}")
	public Response info( @PathParam("id") String id );
}
