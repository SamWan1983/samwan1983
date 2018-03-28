package com.sam.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sam.service.ClassA;
import com.sam.service.ClassB;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Sam.xml");

		ClassA classA = (ClassA) appContext.getBean("classA");
		ClassB classB = (ClassB) appContext.getBean("classB");
		
		classA.testTaskA();
		System.out.println("----------------------------------");
		classB.testTaskB();
	}
	
}
