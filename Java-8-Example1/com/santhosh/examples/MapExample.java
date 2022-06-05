package com.santhosh.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(10, new Employee(10, "AAA", 30, 20000));
		map.put(20, new Employee(20, "BAA", 25, 50000));
		map.put(30, new Employee(30, "CCAA", 30, 60000));
		map.put(0, new Employee(40, "DDAA", 30, 40000));

		for (Entry<Integer, Employee> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
		}

		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v.getName());
		});
	}

}
