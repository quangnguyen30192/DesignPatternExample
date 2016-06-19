package com.quangbnn.pattern.structural.composite;

public class Square implements Shape {
	@Override
	public void draw(String color) {
		System.out.println(String.format("Draw square with color %s", color));
	}
}
