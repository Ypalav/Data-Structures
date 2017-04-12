package com.yogesh.practice;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String studentName;
	private int studentAge;

	public Student(int rollNo, String studentName, int studentAge) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setStudentName(String name) {
		this.studentName = studentName;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getRollNo() {
		return this.rollNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public int getStudentAge() {
		return this.studentAge;
	}

	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		if (this.studentAge == student.studentAge)
			return 0;
		else if (this.studentAge > student.studentAge)
			return 1;
		else
			return -1;
	}

}
