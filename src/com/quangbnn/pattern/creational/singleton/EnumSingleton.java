package com.quangbnn.pattern.creational.singleton;

public enum EnumSingleton {
	
	INSTANCE;
	
	private DatabaseConnection connection;
	
	private EnumSingleton() {
		connection = new DatabaseConnection();
	}
	
	public DatabaseConnection getConnection() {
		return connection;
	}
	
//	And NEVER do that:
//
//		public DatabaseConnection getInstance(){
//		    if(s==null)
//		        return new DatabaseConnection();
//		    else return s;
//		}
}

class DatabaseConnection {
	
	public DatabaseConnection getConnection() {
		return new DatabaseConnection();
	}
}
