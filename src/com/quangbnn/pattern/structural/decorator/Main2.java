package com.quangbnn.pattern.structural.decorator;

public class Main2 {

  public static void main(String[] args) {
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
