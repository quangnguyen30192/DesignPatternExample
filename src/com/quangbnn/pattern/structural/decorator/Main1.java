package com.quangbnn.pattern.structural.decorator;

public class Main1 {

  public static void main(String[] args) {
    System.out.println("decorator 1: only allow procedureFeatures when already added all decorators with basic car");
    System.out.println("Instantiates a new basic car then adding Luxury style and Sport Style by the order but not using procedureFeatures:");
    Car car = new BasicCar();
    car = new SportCarDecorator1(car);
    car = new LuxuryDecorator1(car);
    car.produceFeatures();
    System.out.println(car.getFeatures());
    System.out.println("Instantiates a new basic car then adding Luxury style and Sport Style at the same time:");
    car = new SportCarDecorator1(new LuxuryDecorator1(new BasicCar()));
    car.produceFeatures();
    System.out.println(car.getFeatures());
  }
}
