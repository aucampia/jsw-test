package com.github.aucampia.jsw.test.logic.impl;

import com.github.aucampia.jsw.test.logic.intf.TestServiceLogicInterface;
import com.github.aucampia.jsw.test.logic.intf.TestServiceLogicInterface.Info;

public class TestServiceLogic
{
	public Info info( String id )
	{
		Info info = new Info();
		info.setName( "Kyosti Putkonen" );
		info.setGender( "male" );
		return info;
	}
}
