package com.bjpowernode.di13;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
	
	@Test
	public void test01() {
		/*
		String resource = "com/com.bjpowernode/di13/spring-base.xml";
		String resource2 = "com/com.bjpowernode/di13/spring-beans.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource, resource2);
		*/
		/*
		String resource = "com/com.bjpowernode/di13/spring-base.xml";
		String resource2 = "com/com.bjpowernode/di13/spring-beans.xml";
		String[] resources = {resource, resource2};
		ApplicationContext ac = new ClassPathXmlApplicationContext(resources);
		*/
		
		String resource = "com/bjpowernode/di13/spring-*.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		
		Student student = (Student) ac.getBean("myStudent");
		System.out.println(student);
		
		Teacher teacher = (Teacher) ac.getBean("myTeacher");
		System.out.println(teacher);
	}
	
	
}

























