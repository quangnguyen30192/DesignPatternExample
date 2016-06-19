package com.quangbnn.pattern.creational.factory;

public class ComputerFactory {
	public static AbstractComputer getComputer(String type, String hdd, String ram, String screen) {
		switch (type) {
		case "pc":
			return new PC(hdd, ram, screen);
		case "server":
			return new Server(hdd, ram, screen);
		default:
			return null;
		}
	}
}
