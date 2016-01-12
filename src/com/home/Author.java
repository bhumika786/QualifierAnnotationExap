package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Author
{
	
	@Autowired
	 
	Book bk;
	 
	public void show()
	{
  		System.out.println(bk.getBookname());;
	}
	
	
}
