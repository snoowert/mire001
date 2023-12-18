package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcersiseList {

	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(1);
		scoreList.add(2);
		scoreList.add(5);
		scoreList.add(0,3);
		scoreList.add(4);
		scoreList.add(9);
//		scoreList.add('a');
//		scoreList.add("a");
//		scoreList.add(false);
//		scoreList.add(1.0f);
//		scoreList.add(1.0);
//		scoreList.add(1l);
		//Collections.sort(scoreList, Collections.reverseOrder());
		System.out.println(scoreList);
		System.out.println("scoreList 크기 : " + scoreList.size());
		for(int i = 0; i < scoreList.size(); i++) {
			System.out.println((i+1)+"번째 값 : "+scoreList.get(i));
		}
	}
}
