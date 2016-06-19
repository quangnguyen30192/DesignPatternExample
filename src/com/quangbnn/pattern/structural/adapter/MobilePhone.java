package com.quangbnn.pattern.structural.adapter;

public class MobilePhone {
	
	private static final int MAXIMUM_ENERGY = 100;
	private static final int DEFAULT_VOLTS_CHARGE = 3;
	private int energy;
	private String name;
	
	public MobilePhone(int energy, String name) {
		this.energy = energy;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Status: Mobile: %s - Energy: %d", name, energy);
	}

	public void charge(IMobilePhoneAdapter mobilePhoneAdapter) {
		if(mobilePhoneAdapter.getVoltsForCharging().getVolts() != DEFAULT_VOLTS_CHARGE) {
			throw new IllegalArgumentException("The volts charge should be 3 volts");
		}
		
		while(energy <= MAXIMUM_ENERGY) {
			energy += 5;
			System.out.println(String.format("Charging %d percent", energy));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		System.out.println("Charged completely");
	}
}
