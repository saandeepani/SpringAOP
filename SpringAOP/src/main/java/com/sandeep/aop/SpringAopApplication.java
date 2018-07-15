package com.sandeep.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandeep.aop.services.ShapeServices;

public class SpringAopApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
		ShapeServices shapeService = ctx.getBean("shapeService", ShapeServices.class);
		System.out.println("Circle:  " + shapeService.getCircle().getName());
		System.out.println("Trangle: " + shapeService.getTriangle().getName());
	}
}
