package com.quangbnn.pattern.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {
		AbstractComputer computer = ComputerFactory.getComputer(new PCFactory(
																				"500 GB",
																				"8 GB",
																				"18 inches"));
		System.out.println(computer);
	}
}
