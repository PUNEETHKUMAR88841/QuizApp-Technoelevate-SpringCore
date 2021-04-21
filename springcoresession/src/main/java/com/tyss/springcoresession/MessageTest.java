package com.tyss.springcoresession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.MessageBean;

public class MessageTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beanss.xml");
		
		MessageBean bean=(MessageBean)context.getBean("msgBean");
		System.out.println(bean.getMsg());
		((AbstractApplicationContext)context).close();  //close context
	}

}
