package com.yogesh.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Student> arrList = new ArrayList<Student>();
		arrList.add(new Student(101, "ABC", 25));
		arrList.add(new Student(100, "BBC", 21));
		arrList.add(new Student(105, "XBC", 19));

		Collections.sort(arrList);
		int i = 0;
		for (Student stud : arrList) {
			System.out.println("Student : " + ++i + ":" + stud.getStudentName()
					+ " , " + stud.getRollNo() + " , " + stud.getStudentAge());
		}
	}
}
