package com.quangbnn.pattern.structural.bridge;

public class Main {

  public static void main(String[] args) {
    AbstractShape triangle = new Triangle(new GreenColor());
    triangle.draw();
    
    triangle = new Triangle(new RedColor());
    triangle.draw();
    
    AbstractShape rectangle = new Rectangle(new GreenColor());
    rectangle.draw();
    
    rectangle = new Rectangle(new RedColor());
    rectangle.draw();
    
    AbstractShape square = new Square(new GreenColor());
    square.draw();
    
    square = new Square(new RedColor());
    square.draw();
  }
}
