package com.quangbnn.pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionDestroySingleton {
	public static void main(String[] args) {
		EagerInitialization instanceOne = EagerInitialization.getInstance();
		EagerInitialization instanceTwo = null;
		
		
		Constructor[] constructors = EagerInitialization.class.getConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			try {
				instanceTwo = (EagerInitialization) constructor.newInstance();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
