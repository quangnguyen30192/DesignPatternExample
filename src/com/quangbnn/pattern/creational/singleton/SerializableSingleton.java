package com.quangbnn.pattern.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private SerializableSingleton() {

	}

	private static class SingletonHelper {
		private static final SerializableSingleton INSTANCE = new SerializableSingleton();
	}

	public static SerializableSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	// important method for serialize and de-serialize the singleton
	protected Object readResolve() {
		return getInstance();
	}
}