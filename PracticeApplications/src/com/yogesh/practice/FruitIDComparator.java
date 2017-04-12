package com.yogesh.practice;

import java.util.Comparator;

public class FruitIDComparator implements Comparator<Fruit> {

	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.getFruitID() - o2.getFruitID();
	}

}
