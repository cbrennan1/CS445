package main.java;
// Colin Brennan
// CS 445
// HW1

public class Tiger extends Creature {
	private final String moveString;

	public Tiger(String name) {
		super(name);
		moveString = name + " " + this.getClass().getSimpleName() + " has just pounced.";
	}

	@Override
	public void move() {
		System.out.println(moveString);
	}
	
	public String getMoveString() {
		return this.moveString;
	}

}
