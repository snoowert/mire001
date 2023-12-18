package com.java.collection;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> lottoSet = new TreeSet<Integer>();
		
		while(lottoSet.size()<7) {
			int num = (int)(1 + Math.random() * 45);
			
			lottoSet.add(num);
		}
		
		
		System.out.println(lottoSet);
	}

}
