package com.java.comparator;

import java.util.Comparator;

import com.java.dto.ScoreVO;

public class ScoreTotalComparator implements Comparator<ScoreVO> {
	@Override
	public int compare(ScoreVO score1, ScoreVO score2) {
		// TODO Auto-generated method stub
		if (score1.getNum() == score2.getNum()) {
			return 0;
		} else {
			return score1.total() - score2.total();
		}
	}
}
