package com.quangbnn.pattern.creational.abstractfactory;

public class PCFactory implements AbstractComputerFactory  {
	
	private String hdd;
	private String ram;
	private String screen;
	
	public PCFactory(String hdd, String ram, String screen) {
		this.hdd = hdd;
		this.ram = ram;
		this.screen = screen;
	}

	@Override
	public AbstractComputer getComputer() {
		return new PC(hdd, ram, screen);
	}
}
