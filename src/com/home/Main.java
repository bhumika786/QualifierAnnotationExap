package com.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) {
 
	     ApplicationContext context = 
	    			new ClassPathXmlApplicationContext(new String[] {"SpCOnfig.xml"});
	    	Author au = (Author)context.getBean("author");
	         au.show() ;
	        
	     
	        
	}
}
