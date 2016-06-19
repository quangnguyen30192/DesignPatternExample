package com.quangbnn.pattern.creational.singleton;

public class StaticInit {
	
	private static StaticInit instance;
	
	static {
		try {
			instance = new StaticInit();
		} catch (Exception e) {
			// xử lý exception bắt được
		} finally {
			
		}
	}
	
	private StaticInit() {
		
	}
	
	public static StaticInit getInstance() {
		return instance;
	}
}
