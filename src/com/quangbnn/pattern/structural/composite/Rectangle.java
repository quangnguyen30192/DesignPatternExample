package com.quangbnn.pattern.structural.composite;

public class Rectangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println(String.format("Draw rectangle with color %s", color));
	}

}
