package com.yogesh.practice;

public class Fruit {
	private int fruitID;
	private String fruitName;
	private String fruitDesc;

	public Fruit(int fruitID, String fruitName, String fruitDesc) {
		super();
		this.fruitID = fruitID;
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
	}

	public void setFruitID(int fruitID) {
		this.fruitID = fruitID;
	}

	public int getFruitID() {
		return this.fruitID;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitName() {
		return this.fruitName;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public String getFruitDesc() {
		return this.getFruitDesc();
	}
	
	
	
}
