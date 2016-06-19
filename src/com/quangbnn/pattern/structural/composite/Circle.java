package com.quangbnn.pattern.structural.composite;

public class Circle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println(String.format("Draw circle with color %s", color));
	}
}
