package com.quangbnn.pattern.structural.decorator;

public class Main3 {

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
    
    System.out.println("decorator 2: allow procedureFeatures when at least one decorator with basic car, so we will add or delete its functionality later by the order");
    System.out.println("Instantiates a basic car then procedureFeatures");
    Car car2 = new BasicCar();
    car2.produceFeatures();
    System.out.println(car2.getFeatures());
    
    System.out.println("Add Sport style for the basic car then procedureFeatures");
    car2 = new SportCarDecorator2(car2);
    car2.produceFeatures();
    System.out.println(car2.getFeatures());
    
    System.out.println("Add Luxury style for the basic car then procedureFeatures");
    car2 = new LuxuryDecorator2(car2);
    car2.produceFeatures();
    System.out.println(car2.getFeatures());
    
    System.out.println("Remove sport style then procedureFeatures");
    car2 = new RemoveSportCarDecorator2(car2);
    car2.produceFeatures();
    System.out.println(car2.getFeatures());
    
    System.out.println("But Instantiates a new then adding Luxury style and Sport Style for the basic car at the same time: (wrong)");
    car2 = new SportCarDecorator2(new LuxuryDecorator2(new BasicCar()));
    car2.produceFeatures();
    System.out.println(car2.getFeatures());
  }
}
