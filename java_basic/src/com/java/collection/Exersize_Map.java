package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class Exersize_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("a", 123);
		map.put("b", 456);
		map.put("c", 789);
		map.put("d", "d");
		map.put("e", false);
		map.put("f", 'A');
		map.put("g", 1.5f);

		for (int i = 0; i < map.size(); i++) {
			char temp = 'a';
			String key = "" + (char) (temp + i);
			System.out.println("Key : " + key + "  Value : " + map.get(key));
		}
	}

}
