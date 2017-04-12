package com.yogesh.practice;

public class ArmstrongNumber {

	public void armstrongNumber() {
		// print all num from 0 to 999
		// 371
		for (int i = 0; i < 1000; i++) {
			int j = i;
			int tempNumber = 0;
			int newNumber = 0;
			while (j != 0) {
				newNumber = newNumber + (int) (Math.pow((j % 10), 3));
				j = j / 10;
			}
			if (newNumber == i)
				System.out.println(i);

		}
	}

}
