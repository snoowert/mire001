package com.java.comparator;

import java.util.Comparator;

import com.java.dto.ScoreVO;

public class ScoreDateComparator implements Comparator<ScoreVO> {
	@Override
	public int compare(ScoreVO o1, ScoreVO o2) {
		// TODO Auto-generated method stub
		return o1.GetDate().compareTo(o2.GetDate());
	}
}
