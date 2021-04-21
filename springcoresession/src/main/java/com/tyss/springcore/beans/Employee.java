package com.tyss.springcore.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //parameterized constructors by lombok
public class Employee implements Serializable{
	
	public Employee() {
		
	}
	
	private int id;
	
	private String name;
	
	private Department dept;//creating reference of depended obj DI
	

}
