package com.AppliedPro.springboot.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class HelloControl {
	@RequestMapping(value="/hello" , method=RequestMethod.GET)
	public String Hello()
	{
		return "Hello";
	}
	
	@RequestMapping(value="/number" , method=RequestMethod.POST)
	public Integer Nubmer()
	{
		int a = 2, b = 4, c=a*b;
		
		return c;	
	}
}