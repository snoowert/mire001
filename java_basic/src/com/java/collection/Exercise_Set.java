package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.java.comparator.ScoreDateComparator;
import com.java.comparator.ScoreTotalComparator;
import com.java.dto.ScoreVO;

public class Exercise_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ScoreVO> set = new TreeSet<ScoreVO>();
		Set<ScoreVO> treeSetByComparator = new TreeSet<ScoreVO>(new ScoreTotalComparator());

		for (int i = 0; i < 3; i++) {
			ScoreVO sVO1 = new ScoreVO();
			sVO1.inputScore(i + 1);
			set.add(sVO1);
			treeSetByComparator.add(sVO1);
		}

		System.out.println("Set ������ : " + set.size());
		Iterator<ScoreVO> it = set.iterator();
		Iterator<ScoreVO> its = treeSetByComparator.iterator();
		while (it.hasNext()) {
			it.next().printScore();
		}

		System.out.println("---");
		while (its.hasNext()) {
			its.next().printScore();
		}
	}

}
