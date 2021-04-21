package com.tyss.springcoresession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest2 {
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employeeconfig.xml");
		applicationContext.getBean("emp");
	}

}
