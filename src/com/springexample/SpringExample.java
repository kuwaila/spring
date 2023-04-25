package com.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.Bean.Student;

public class SpringExample {

	public static void main(String[] args) {
		//load xml file
		ApplicationContext ac =  new ClassPathXmlApplicationContext("spring.xml");
		//get bean tag from xml
		Student s1 =(Student) ac.getBean("s1");
		System.out.println(s1.getId1());
		System.out.println(s1.getName());
		System.out.println(s1.getQualification());
	

	}

}
