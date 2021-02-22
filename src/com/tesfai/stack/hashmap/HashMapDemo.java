package com.tesfai.stack.hashmap;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class HashMapDemo {
	public static void main(String[] args) {
		// Create a HashMap of key as String List Of integers as Value
		Hashtable<String, List<Double>> lang = new Hashtable<String, List<Double>>();

		// Add List as value in the map
		lang.put("Java", Arrays.asList(1.7, 1.8, 9.0, 10.0));
		// Add List as value in the map
		lang.put("C++", Arrays.asList(1.0, 1.3, 3.0, 4.0));
		// Add List as value in the map
		lang.put("C", Arrays.asList(1.4, 1.9, 5.1, 7.1));
		// Print the Map Contents
		for (String k : lang.keySet()) {
			for (Double v : lang.get(k)) {
				System.out.println(k + " : " + v);
			}

		}
	}
}
