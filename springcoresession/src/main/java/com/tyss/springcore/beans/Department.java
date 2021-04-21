package com.tyss.springcore.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class Department implements Serializable {
	
	public Department() {
		
	}
	
	private int dId;
	private String dName;
	
	

}
