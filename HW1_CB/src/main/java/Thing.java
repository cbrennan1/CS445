package main.java;
// Colin Brennan
// CS 445
// HW1

public class Thing {
	final private String name;
	
	public Thing(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String nameOfClass = getClass().getSimpleName();
		if (nameOfClass.equals("Thing")) {
			return name;
		}
		return name + " " + nameOfClass;
	}
}
