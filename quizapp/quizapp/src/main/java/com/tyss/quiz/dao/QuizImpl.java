package com.tyss.quiz.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.quiz.bean.Login;
import com.tyss.quiz.bean.Register;
import com.tyss.quiz.qns.JavaMcq;

public class QuizImpl implements QuizDAO {
	
	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;
	Scanner scanner = new Scanner(System.in);
	
	
	public void register() {
		
			Register register = new Register();
			
			System.out.println("Enter the information to register");
			
			System.out.println("Enter the userid");
			register.setUserid(scanner.nextInt());
			
			System.out.println("Enter the username");
			register.setUsername(scanner.next());
			
			System.out.println("Enter the Email");
			register.setEmail(scanner.next());

			System.out.println("Enter the password");
			register.setPassword(scanner.next());
			
			try {
				factory = Persistence.createEntityManagerFactory("quizData");
				manager = factory.createEntityManager();
			 	transaction = manager.getTransaction();
				
				transaction.begin();
				
				manager.persist(register);
				
				System.out.println("Registered Successfully");
				
				transaction.commit();
				
			} catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			
			finally {
				if(manager != null) {
					manager.close();
				}
				if(factory != null) {
					factory.close();
				}
			}	
	}


  public void login() {
	  Login login = new Login();
	  
	  System.out.println("Enter userid");
	  login.setUserid(scanner.nextInt());
	  
	  System.out.println("Enter Name");
	  login.setPassword(scanner.next());
	  
	  try {
		  factory = Persistence.createEntityManagerFactory("quizData");
		  manager = factory.createEntityManager();
		  
		  transaction.begin();
		  manager.persist(login);
		  transaction.commit();
		
	} catch (Exception e) {
		if(transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
	  
	  finally {
		if(manager != null) {
			manager.close();
		}
		if(factory != null) {
			factory.close();
		}
	}
	  
	  System.out.println("Enter your choice");
	  int p=scanner.nextInt();
	  System.out.println("1.Java");
	  switch (p) {
	case 1:JavaMcq javaMcq=new JavaMcq();
				javaMcq.java();
		
		break;

	default:
		break;
	}
	  
	  
	  
	  
	
  }
	
}
