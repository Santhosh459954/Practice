package com.santhosh.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(400);
		list.add(200);
		list.add(500);
		list.add(800);
		
		System.out.println("Before Sorting.." + list);
		
		list.stream().sorted().forEach(System.out::println);
		list.stream().sorted(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		
		list.stream().sorted((o1,o2) -> o2 - o1).forEach(System.out::println);
		
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("Sorting in ascending" + list);
		
		Collections.reverse(list);
		
		System.out.println("Sorting in descending" +list);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10,"Santhosh",30,40000));
		empList.add(new Employee(20,"Santhosh",40,10000));
		empList.add(new Employee(30,"Santhosh",50,30000));
		
		System.out.println("Before Sorting.." + empList);
		
		/*
		 * Collections.sort(empList, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return (o1.getSalary() - o2.getSalary()); } });
		 */
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (o2.getSalary() - o1.getSalary());
			}
		});
		
		System.out.println("After Sorting.." + empList);
		
		//using lambda expressions
		
		Collections.sort(empList, (o1, o2) -> (o1.getSalary() - o2.getSalary()));
		
		System.out.println("After Sorting.." + empList);
	}

}
