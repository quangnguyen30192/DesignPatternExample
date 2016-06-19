package com.quangbnn.pattern.creational.prototype;

import java.util.List;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emps = new Employee();
		emps.loadData();
		System.out.println("emps List: " + emps.getList());
		System.out.println("emps List hashCode: " + emps.getList().hashCode());
		System.out.println("emps hashCode: " + emps.hashCode());
		System.out.println();
		
		Employee empsNew = (Employee) emps.clone();
		List<String> list = empsNew.getList();
		list.add("John");
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew List hashCode: " + list.hashCode());
		System.out.println("empsNew hashCode: " + empsNew.hashCode());
		System.out.println();
		
		Employee empsNew1 = (Employee) emps.clone();
		List<String> list1 = empsNew1.getList();
		list1.remove("1");
		System.out.println("empsNew1 List: " + list1);
		System.out.println("empsNew1 List hashCode: " + list1.hashCode());
		System.out.println("empsNew1 hashCode: " + empsNew1.hashCode());
		System.out.println();
	}
}
