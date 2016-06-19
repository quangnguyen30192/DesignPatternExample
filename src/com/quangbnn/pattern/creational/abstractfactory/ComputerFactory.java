package com.quangbnn.pattern.creational.abstractfactory;

public class ComputerFactory {
	public static AbstractComputer getComputer(AbstractComputerFactory computerFactory) {
		return computerFactory.getComputer();
	}
}
