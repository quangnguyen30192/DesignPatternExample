package com.quangbnn.pattern.structural.adapter;

public class Test {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone(0, "Samsung Galaxy Ace");
		mobilePhone.charge(new ClassMobilePhoneAdapter());
		System.out.println(mobilePhone);
		
		MobilePhone mobilePhone2 = new MobilePhone(0, "HTC one");
		mobilePhone2.charge(new ObjectMobilePhoneAdapter());
		System.out.println(mobilePhone2);
	}
}