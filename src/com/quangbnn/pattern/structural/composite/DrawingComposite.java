package com.quangbnn.pattern.structural.composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DrawingComposite implements Shape {
	
	private List<Shape> list;
	
	public DrawingComposite() {
		list = new LinkedList<Shape>();
	}

	public void add(Shape shape) {
		list.add(shape);
	}
	
	public void remove(Shape shape) {
		list.remove(shape);
	}
	
	@Override
	public void draw(String color) {
		Iterator<Shape> shapeIterator = list.iterator();
		while(shapeIterator.hasNext()) {
			Shape shape = shapeIterator.next();
			shape.draw(color);
		}
	}
	
	public void clear() {
		System.out.println("Clear all shapes");
		list.clear();
	}
}