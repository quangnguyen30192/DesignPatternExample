package com.quangbnn.pattern.creational.builder;

public class Test {

  public static void main(String[] args) {
    Computer computer = new Computer.ComputerBuilder(
                                                     "500 GB",
                                                     "8 GB").setBluetoothEnable(true).setWifiEnable(true).build();
  }
}
