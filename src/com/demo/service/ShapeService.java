package com.demo.service;

import com.demo.model.Circle;
import com.demo.model.Triangle;

public class ShapeService {
	
	Circle circle;
	Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Triangle getTriangle() {
		System.out.println("Returning Triangle obj");
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
