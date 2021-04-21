package com.tyss.quiz.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="login")
public class Login implements Serializable {
	
	@Id
	private int userid;
	
	@Column
	private String password;
	

}
