package com.quangbnn.pattern.creational.builder;

public class Computer {

	// required attributes
	private String hdd;
	private String ram;

	// optional attributes
	private boolean isBluetoothEnable;
	private boolean isWifiEnable;

	// only getter
	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isBluetoothEnable() {
		return isBluetoothEnable;
	}

	public boolean isWifiEnable() {
		return isWifiEnable;
	}
	
	private Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.isBluetoothEnable = builder.isBluetoothEnable;
		this.isWifiEnable = builder.isWifiEnable;
	}
	
	// builder class
	public static class ComputerBuilder {
		// required attributes
		private String hdd;
		private String ram;

		// optional attributes
		private boolean isBluetoothEnable;
		private boolean isWifiEnable;
		
		public ComputerBuilder(String hdd, String ram) {
			this.hdd = hdd;
			this.ram = ram;
		}
		
		public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;
			return this;
		}
		
		public ComputerBuilder setWifiEnable(boolean isWifiEnable) {
			this.isWifiEnable = isWifiEnable;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}