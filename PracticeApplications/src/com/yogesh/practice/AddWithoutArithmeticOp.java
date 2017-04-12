package com.yogesh.practice;

public class AddWithoutArithmeticOp {

	public int adder(int a, int b) {
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}

}
