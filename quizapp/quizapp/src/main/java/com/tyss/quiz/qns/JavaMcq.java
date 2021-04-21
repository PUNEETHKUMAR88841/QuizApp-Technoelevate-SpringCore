package com.tyss.quiz.qns;

import java.util.Scanner;

public class JavaMcq {
	
	public void java() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your correct choice");
		System.out.println("1.Which of the following option leads to the portability and security of Java?");
		System.out.println("1.Bytecode is executed by JVM 2.The applet makes the Java code secure and portable 3.Use of exception handling 4.Dynamic binding between objects");
		int n=scanner.nextInt();
		
		switch (n) {
		
		case 1:if(n==1) {
			System.out.println("Correct answer");
		}else {
			
		}
			break;

		default:System.out.println("Incorrect answer");
			break;
		}
		System.out.println("***************");
		System.out.println("Enter your correct choice");
		System.out.println("2.Which of the following is not a Java features?");
		System.out.println("1.Dynamic\r\n"
				+ "2.Architecture Neutral\r\n"
				+ "3.Use of pointers\r\n"
				+ "4.Object-oriented");
		int m=scanner.nextInt();
		
		switch (m) {
		
		case 3:if(m==3) {
			System.out.println("Correct answer");
		}else {
			
		}
			break;

		default:System.out.println("Incorrect answer");
			break;
		}
		
	}

}
