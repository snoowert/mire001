package com.java.object;

import com.java.dto.ScoreVO;

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreVO score1 = new ScoreVO();
		ScoreVO score2 = new ScoreVO();
		
		score1.inputScore(1);
		score2.inputScore(2);
		System.out.println("Score1.hashCode() : " + score1.hashCode());
		System.out.println("Score2.hashCode() : " + score2.hashCode());

		System.out.println("Score1.equals(score2) : " + score1.equals(score2));

		System.out.println(score1);
		System.out.println(score2);
	}

}
