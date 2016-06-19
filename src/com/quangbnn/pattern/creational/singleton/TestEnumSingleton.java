package com.quangbnn.pattern.creational.singleton;

public class TestEnumSingleton {
	public static void main(String[] args) {
		DatabaseConnection connectionOne = EnumSingleton.INSTANCE.getConnection();
		DatabaseConnection connectionTwo = EnumSingleton.INSTANCE.getConnection();
		System.out.println(connectionOne.hashCode());
		System.out.println(connectionTwo.hashCode());
		
	}
}
