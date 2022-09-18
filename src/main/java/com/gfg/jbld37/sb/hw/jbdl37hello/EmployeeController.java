package com.gfg.jbld37.sb.hw.jbdl37hello;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	ArrayList<String> alList = new ArrayList<>(); 
	
	@RequestMapping(value = "/employee/test")
	public String employeeTest() {
		//alList = new ArrayList<>(); 
		alList.add("Aditya");
		alList.add("David");
		alList.add("Den");
		alList.add("John");

		return "Array has objects: "+alList.size();
		
	}
	
	@RequestMapping(value = "/employee/add/{name}")
	public String addToEmployee(@PathVariable("name")String name) {
		
		if(name!= null && !name.equals("")) {
			alList.add(name);
		}

		return "Array has objects: "+alList.size()+" after adding "+name;
		
	}
	
	@RequestMapping(value = "/employee/getAll")
	public String getAllEmployees() {
		
		String emp = "";
		for (int i = 0; i < alList.size(); i++) {
			emp=emp+" "+alList.get(i);
		}

		return "Array :"+emp;
		
	}
	@RequestMapping(value = "/employee/get/{index}")
	public String getAnEmployee(@PathVariable("index")int index) {
		
		String msg="";
		if(alList.size()>index) {
			String s = alList.get(index);
			msg = "Element at index:"+index+" is:"+s;
		}else {
			msg= "Fetching is not possible is array size is smaller than the index passed.";
		}
		
		return msg;
		
	}
	
	@RequestMapping(value = "/employee/delete/{index}")
	public String deleteEmployee(@PathVariable("index")int index) {
		
		String msg="";
		if(alList.size()>index) {
			String s = alList.remove(index);
			msg = "Element removed:"+s;
		}else {
			msg= "Deletion is not possible is array size is smaller than the index passed.";
		}
		
		return msg;
		
		
	}
	
	@RequestMapping(value = "/employee/greet/{name}")
	public String greetEmployee(@PathVariable("name") String name) {
		return "Hello "+name;
		
	}


}
