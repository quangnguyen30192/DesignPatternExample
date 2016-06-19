package com.quangbnn.pattern.structural.composite;

public class Test {
	public static void main(String[] args) {
		DrawingComposite composite = new DrawingComposite();
		composite.add(new Square());
		composite.add(new Square());
		composite.add(new Rectangle());
		composite.add(new Circle());
		composite.draw("red");
	}
}
