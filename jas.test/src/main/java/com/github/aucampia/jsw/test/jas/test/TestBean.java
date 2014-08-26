package com.github.aucampia.jsw.test.jsy.adapt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// http://docs.oracle.com/javaee/7/api/index.html?javax/enterprise/context/ApplicationScoped.html
import javax.enterprise.context.ApplicationScoped;

// http://docs.oracle.com/javaee/7/api/index.html?javax/inject/Singleton.html
//import javax.inject.Singleton;

// http://docs.oracle.com/javaee/7/api/index.html?javax/ejb/Singleton.html
import javax.ejb.Singleton;

// http://docs.oracle.com/javaee/7/api/index.html?javax/ejb/Startup.html
import javax.ejb.Startup;

// http://docs.oracle.com/javaee/7/api/index.html?javax/annotation/PreDestroy.html
import javax.annotation.PreDestroy;

// http://docs.oracle.com/javaee/7/api/index.html?javax/annotation/PostConstruct.html
import javax.annotation.PostConstruct;

// http://docs.oracle.com/javaee/7/api/index.html?javax/inject/Named.html
import javax.inject.Named;

//@Named
@Singleton
@Startup
//@ApplicationScoped
public class TestBean
{

	private static final Logger LOG = LoggerFactory.getLogger( TestBean.class );

	@PostConstruct
	void postConstruct()
	{
		LOG.error( "jsw.test.jas.test.TestBean.postConstruct: ..." );
		System.out.println( "jsw.test.jas.test.TestBean.postConstruct: ..." );
		String myString = null;
		myString.length();
	}

	@PreDestroy
	void preDestroy()
	{
		LOG.error( "jsw.test.jas.test.TestBean.preDestroy: ..." );
		System.out.println( "jsw.test.jas.test.TestBean.preDestroy: ..." );
	}

}
