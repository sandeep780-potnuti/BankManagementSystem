package com.bank.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BankFrontEndController extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class springConfigClasses[]= {BankConfig.class};
		return springConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String mappings[]= {"/magadha/*"};
		return mappings;
	}

}
