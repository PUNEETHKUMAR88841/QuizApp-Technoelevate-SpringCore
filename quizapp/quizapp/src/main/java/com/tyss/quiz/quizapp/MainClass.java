package com.tyss.quiz.quizapp;

import java.util.Scanner;

import com.tyss.quiz.dao.QuizDAO;
import com.tyss.quiz.dao.QuizImpl;

public class MainClass {

	public static void main(String[] args) {
		QuizDAO dao = new QuizImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1.Register 2.Login");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:dao.register();
		break;
		
		case 2: dao.login();
		break;
		default:System.out.println("Invalid");
		}
		

	}

}
