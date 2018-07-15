package com.sandeep.aop.services;

import com.sandeep.aop.model.Circle;
import com.sandeep.aop.model.Triangle;

public class ShapeServices {
	
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
