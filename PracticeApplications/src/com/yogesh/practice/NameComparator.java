package com.yogesh.practice;

import java.util.Comparator;

public class NameComparator implements Comparator<Fruit> {

	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		/* Fruit fruit1=o1; */
		return o1.getFruitName().compareTo(o2.getFruitName());
	}

}
