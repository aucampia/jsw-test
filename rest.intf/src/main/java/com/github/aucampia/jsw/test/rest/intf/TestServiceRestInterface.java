package com.github.aucampia.jsw.test.rest.intf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import java.io.IOException;

@Path("/test")
public interface TestServiceRestInterface
{
	@GET
	@Path("/info/{id}")
	public Response info( @PathParam("id") String id )
		throws IOException;
}
