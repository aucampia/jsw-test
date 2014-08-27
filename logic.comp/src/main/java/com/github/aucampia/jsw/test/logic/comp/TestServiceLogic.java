package com.github.aucampia.jsw.test.logic.comp;

import com.github.aucampia.jsw.test.logic.intf.TestServiceLogicInterface;
import com.github.aucampia.jsw.test.logic.intf.TestServiceLogicInterface.Info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestServiceLogic
	implements TestServiceLogicInterface
{
	private static final Logger LOG = LoggerFactory.getLogger( TestServiceLogic.class );

	public Info info( String id )
	{
		Info info = new Info();
		info.setName( "Kyosti Putkonen" );
		info.setGender( "male" );
		return info;
	}

	private String name = "Kyosti Putkonen";
	public String getName()
	{
		return this.name;
	}
	public void setName( String name )
	{
		this.name = name;
	}

	private String gender = "male";
	public String getGender()
	{
		return this.gender;
	}
	public void setGender( String gender )
	{
		this.gender = gender;
	}

	public void init()
	{
		LOG.info( "jsw.test.logic.comp.TestServiceLogic.init: ..." );
	}
	
	public void destroy()
	{
		LOG.info( "jsw.test.logic.comp.TestServiceLogic.destroy: ..." );
	}
}
