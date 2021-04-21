 package com.tyss.quiz.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "registerform")
@Data
public class Register implements Serializable{
	
	@Id
	@Column(name="userid")
	private int userid;
	
	@Column(name="username")
	private String username;
	
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="password")
	private String password;

}
