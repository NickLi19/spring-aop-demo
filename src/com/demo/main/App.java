package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ShapeService;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ShapeService shapeService = appContext.getBean("shapeService", ShapeService.class);

		/*try {
			shapeService.getTriangle().setName("Equilateral Triangle");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("------------------------------------");
		Comment out initialization in xml configuration*/

//		System.out.println(shapeService.getTriangle().getName());
//		System.out.println("------------------------------------");
//
//		shapeService.getTriangle().setName("Equilateral Triangle");
//		System.out.println("------------------------------------");
//
//		shapeService.getTriangle().setCity("New York");
//		System.out.println("------------------------------------");
		
		shapeService.getCircle().getName();
		System.out.println("------------------------------------");
	}

}
