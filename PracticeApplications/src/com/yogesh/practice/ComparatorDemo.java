package com.yogesh.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Fruit> arrList = new ArrayList<Fruit>();
		arrList.add(new Fruit(4, "Apple", "Red Delicious"));
		arrList.add(new Fruit(7, "Mango", "Red Delicious"));
		arrList.add(new Fruit(1, "Banana", "Red Delicious"));
		arrList.add(new Fruit(6, "Guava", "Red Delicious"));

		Collections.sort(arrList, new FruitIDComparator());
		// print the collections sorted
		Collections.sort(arrList, new NameComparator());
	}
}
