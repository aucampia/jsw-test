package com.github.aucampia.jsw.test.rest.impl;

import com.github.aucampia.jsw.test.rest.intf.TestServiceRestInterface;
import com.github.aucampia.jsw.test.logic.intf.TestServiceLogicInterface;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import java.io.IOException;

public class TestServiceRest
	implements TestServiceRestInterface
{

	private TestServiceLogicInterface logic;
	public TestServiceLogicInterface getLogic()
	{
		return this.logic;
	}
	public void setLogic( TestServiceLogicInterface logic )
	{
		this.logic = logic;
	}


	public Response info( String id )
		throws IOException
	{
		TestServiceLogicInterface.Info info = logic.info( id );
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure( SerializationConfig.Feature.INDENT_OUTPUT, true );
		String json = objectMapper.writeValueAsString( info );
		return Response.ok( json, MediaType.APPLICATION_JSON ).build();
	}
}
