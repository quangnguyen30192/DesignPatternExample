package com.quangbnn.pattern.structural.adapter;

public class ClassMobilePhoneAdapter extends Socket implements IMobilePhoneAdapter {
	@Override
	public Volt getVoltsForCharging() {
		return new Volt(getVolt().getVolts() / 40);
	}
}
