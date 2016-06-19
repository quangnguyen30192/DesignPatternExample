package com.quangbnn.pattern.creational.abstractfactory;

/**
 * @author QuangNguyen
 *
 */
public class ServerFactory implements AbstractComputerFactory {
	
	/**
	 * 
	 */
	private transient final String hdd;
	/**
	 * 
	 */
	private String ram;
	/**
	 * 
	 */
	private String screen;

	/**
	 * @param hdd
	 * @param ram
	 * @param screen
	 */
	public ServerFactory(String hdd, String ram, String screen) {
		this.hdd = hdd;
		this.ram = ram;
		this.screen = screen;
	}

	/* (non-Javadoc)
	 * @see com.quangbnn.abstractfactory.AbstractComputerFactory#getComputer()
	 */
	@Override
	public AbstractComputer getComputer() {
		return new Server(hdd, ram, screen);
	}
}