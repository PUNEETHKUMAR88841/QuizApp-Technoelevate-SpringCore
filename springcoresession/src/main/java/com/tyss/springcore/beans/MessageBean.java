package com.tyss.springcore.beans;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;


@Data
public class MessageBean implements Serializable,InitializingBean,DisposableBean{
	
	public MessageBean() {
		System.out.println("Insta Pgase");
	}
	
	String msg;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init Phase");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy phase");
		
	}	
}
