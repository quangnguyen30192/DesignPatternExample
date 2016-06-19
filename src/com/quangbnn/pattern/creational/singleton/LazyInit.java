package com.quangbnn.pattern.creational.singleton;

public class LazyInit {

	private static volatile LazyInit instance;

	private LazyInit() {

	}

	public static LazyInit getInstance() {
		if (instance == null) {
			instance = new LazyInit();
		}
		return instance;
	}
}
