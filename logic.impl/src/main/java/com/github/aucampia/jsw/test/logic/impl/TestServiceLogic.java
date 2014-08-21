package com.github.aucampia.jsw.test.logic.impl;

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

	public void init()
	{
		LOG.info( "jsw.test.logic.impl.TestServiceLogic.init: ..." );
	}
	
	public void destroy()
	{
		LOG.info( "jsw.test.logic.impl.TestServiceLogic.destroy: ..." );
	}
}
