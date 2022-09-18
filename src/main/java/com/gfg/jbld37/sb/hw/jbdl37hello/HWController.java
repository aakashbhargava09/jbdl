package com.gfg.jbld37.sb.hw.jbdl37hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWController {
	
	@RequestMapping(value="/")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(value="/test")
	public String test() {
		return "API service is working!";
	}

}
