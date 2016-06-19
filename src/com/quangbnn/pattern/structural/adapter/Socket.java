package com.quangbnn.pattern.structural.adapter;

public class Socket {
	
	private static final int DEFAULT_VOLT = 120;
	private Volt volt;
	
	public Socket() {
		volt = new Volt(DEFAULT_VOLT);
	}

	public Volt getVolt() {
		return volt;
	}
}
