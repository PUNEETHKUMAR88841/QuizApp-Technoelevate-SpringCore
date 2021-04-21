package com.tyss.springcoresession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeTest employeeTest=(EmployeeTest) applicationContext.getBean("empobj");
		
		
		
	}

}
