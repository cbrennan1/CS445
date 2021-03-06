package main.java;
// Colin Brennan
// CS 445
// HW1

public class Ant extends Creature{
	private final String moveString;

	public Ant(String name) {
		super(name);
		moveString = super.toString() + " is crawling around.";
	}

	@Override
	public void move() {
		System.out.println(moveString);
	}
	
	public String getMoveString() {
		return this.moveString;
	}
}
