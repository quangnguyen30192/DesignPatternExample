package com.quangbnn.pattern.structural.adapter;

public class ObjectMobilePhoneAdapter implements IMobilePhoneAdapter {
	
	private Socket socket;
	
	public ObjectMobilePhoneAdapter() {
		socket = new Socket();
	}

	@Override
	public Volt getVoltsForCharging() {
		return new Volt(socket.getVolt().getVolts() / 40);
	}
}
