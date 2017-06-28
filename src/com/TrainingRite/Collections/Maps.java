package com.TrainingRite.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Maps are all about KEY-VALUE pairs
		
		
		// HashMap: order is random
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		//LinkedHashMap: order is retained
		LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<Integer, String>();
		
		// TreeMap: natural order (numerical / alphabetical)
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		
		//mapUtil(hMap);
		//mapUtil(lhMap);
		mapUtil(tMap);

	}
	
	public static void mapUtil(Map<Integer, String> map) {
		
		// Adding Key-Value Pairs
		map.put(101, "Steve");
		map.put(103, "Nancy");
		map.put(354, "Rob");
		map.put(22, "Sarah");		
		map.put(2002, "Jerry");
		
		System.out.println("See all of the KEYS: " + map.keySet());
		System.out.println("See all of the key-value PAIRS " + map);
		
		// Iterate through Maps
		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
