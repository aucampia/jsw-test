package com.github.aucampia.jsw.test.jsy.adapt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// http://docs.oracle.com/javaee/7/api/index.html?javax/enterprise/context/ApplicationScoped.html
import javax.enterprise.context.ApplicationScoped;
// http://docs.oracle.com/javaee/7/api/index.html?javax/annotation/PreDestroy.html
import javax.annotation.PreDestroy;
// http://docs.oracle.com/javaee/7/api/index.html?javax/annotation/PostConstruct.html
import javax.annotation.PostConstruct;
// http://docs.oracle.com/javaee/7/api/index.html?javax/inject/Named.html
import javax.inject.Named;

@Named
@ApplicationScoped
public class TestServiceLogic
	extends com.github.aucampia.jsw.test.logic.comp.TestServiceLogic
{

	private static final Logger LOG = LoggerFactory.getLogger( TestServiceLogic.class );

	@PostConstruct
	void postConstruct()
	{
		LOG.info( "jsw.test.jsy.adapt.TestServiceLogic.postConstruct: ..." );
		super.init();
	}

	@PreDestroy
	void preDestroy()
	{
		LOG.info( "jsw.test.jsy.adapt.TestServiceLogic.preDestroy: ..." );
		super.destroy();
	}

}
