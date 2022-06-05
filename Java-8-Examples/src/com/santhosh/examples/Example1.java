package com.santhosh.examples;

import lombok.Data;

public class Example1 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		Employee1 e = new Employee1();
	}

}

@Data
 class Employee1 {
	private int id;
	private String firstName;
	private String lastName;

}
