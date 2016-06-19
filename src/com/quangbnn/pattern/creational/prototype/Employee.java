package com.quangbnn.pattern.creational.prototype;

import java.util.LinkedList;
import java.util.List;

public class Employee implements Cloneable {
	
	private List<String> list;
	
	public void loadData() {
		list = new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
	}
	
	public List<String> getList() {
		return list;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}

	public Employee() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> newList = new LinkedList<String>(); 
		newList.addAll(list);
		Employee employee = new Employee();
		employee.setList(newList);
		return employee;
	}
}