package com.quangbnn.pattern.creational.factory;

public class Server extends AbstractComputer {

	private String hdd;
	private String ram;
	private String screen;
	
	public Server(String hdd, String ram, String screen) {
		this.hdd = hdd;
		this.ram = ram;
		this.screen = screen;
	}

	@Override
	public String getHDD() {
		return hdd;
	}

	@Override
	public String getRAM() {
		return ram;
	}

	@Override
	public String getScreen() {
		return screen;
	}
	
	@Override
	public String toString() {
		return String.format("Server info: RAM: %s - HDD: %s - Screen: %s", getRAM(), getHDD(), getScreen());
	}
}
