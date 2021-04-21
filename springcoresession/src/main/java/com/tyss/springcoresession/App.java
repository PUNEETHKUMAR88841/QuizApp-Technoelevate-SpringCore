package com.tyss.springcoresession;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");//aplication context create obj employy
    	Employee  employee=(Employee) context.getBean("emp");
    	Employee  employee2=(Employee) context.getBean("emp");
    	
    	
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the name of first employee");
    	String name=scanner.nextLine();
    	employee.setName(name);
    	
    	System.out.println("Enter the id");
    	String num=scanner.nextLine();
    	int id=Integer.parseInt(num);
    	employee.setId(id);
    	System.out.println(employee);
    	
    	
    	System.out.println("Enter the name of sec employee");
    	employee.setName(scanner.nextLine());
    	
    	System.out.println("Enter the id");
    	String num1=scanner.nextLine();
    	int id1=Integer.parseInt(num1);
    	employee2.setId(id1);
    	
    	System.out.println(employee2);
    	System.out.println(employee);
    	
//        System.out.println(employee.getId() );
//        System.out.println(employee.getName());
//        
    }
}
