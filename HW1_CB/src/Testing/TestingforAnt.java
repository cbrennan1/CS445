package Testing;

import Main.Ant;
import Main.Bat;
import Main.Fly;
import Main.Thing;
import Main.Tiger;


public class TestingforAnt{
	// String fixtures
	private final static String antName;
	private final static String antEatingExpectedOutput;
	private final static String didAntEatExpectedOutput;

	private final static String batName;
	private final static String batEatingExpectedOutput;
	private final static String didBatEatExpectedOutput;
	
	private final static String flyName;	
	private final static String flyEatingExpectedOutput;
	private final static String didFlyEatExpectedOutput;
	
	private final static String thingName;
	private final static String thingEatingExpectedOutput;
	private final static String didThingEatExpectedOutput;
	
	private final static String tigerName;
	private final static String tigerEatingExpectedOutput;
	private final static String didTigerEatExpectedOutput;
	
	private final static String moveExpectedOutput;
	private final static String didNotEatExpectedOutput;
		
	static {
		antName = "Bob the Builder";
		antEatingExpectedOutput = antName+ " Ant has just eaten a Ant" ;
		didAntEatExpectedOutput = antName+ " Ant has eaten a Ant";
		
		batName = "Bruce Wayne";
		batEatingExpectedOutput = antName+ " Ant has just eaten a Bat" ;
		didBatEatExpectedOutput = antName+ " Ant has eaten a Bat";
		
		flyName = "Frozone";
		flyEatingExpectedOutput = antName + " Ant has just eaten a Fly" ;
		didFlyEatExpectedOutput = antName + " Ant has eaten a Fly";
		
		thingName = "Barry Allen";
		thingEatingExpectedOutput = antName + " Ant has just eaten a Thing" ;
		didThingEatExpectedOutput = antName + " Ant has eaten a Thing";
		
		tigerName = "Bob Marley";
		tigerEatingExpectedOutput = antName + " Ant has just eaten a Tiger" ;
		didTigerEatExpectedOutput = antName + " Ant has eaten a Tiger";
		
		moveExpectedOutput = antName + " Ant is crawling around.";
		didNotEatExpectedOutput = antName + " Ant has had nothing to eat!";
	}
		
	public static void testEatingAntExpectedOutput() {
		Ant ant = new Ant(antName);
		Ant aAnt = new Ant(antName);
		ant.eat(aAnt);
		if (ant.obtainCurrentMealLog().equals(antEatingExpectedOutput)) {
			System.out.println("antEatingExpectedOutput SUCCESSFULLY PASSED testing.");
		}else {
			System.out.println("antEatingExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testHasEatenAntExpectedOutput() {
		Ant ant = new Ant(antName);
		Ant aAnt = new Ant(antName);
		ant.eat(aAnt);
		ant.whatDidYouEat();
		if (ant.obtainCurrentMealLog().equals(didAntEatExpectedOutput)) {
			System.out.println("didAntEatExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("didAntEatExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testEatingBatExpectedOutput() {
		Ant ant = new Ant(antName);
		Bat aBat = new Bat(batName);
		ant.eat(aBat);
		if (ant.obtainCurrentMealLog().equals(batEatingExpectedOutput)) {
			System.out.println("batEatingExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("batEatingExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testHasEatenBatExpectedOutput() {
		Ant ant = new Ant(antName);
		Bat aBat = new Bat(batName);
		ant.eat(aBat);
		ant.whatDidYouEat();
		if (ant.obtainCurrentMealLog().equals(didBatEatExpectedOutput)) {
			System.out.println("didBatEatExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("didBatEatExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testEatingFlyExpectedOutput() {
		Ant ant = new Ant(antName);
		Fly aFly = new Fly(flyName);
		ant.eat(aFly);
		if (ant.obtainCurrentMealLog().equals(flyEatingExpectedOutput)) {
			System.out.println("flyEatingExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("flyEatingExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testHasEatenFlyExpectedOutput() {
		Ant ant = new Ant(antName);
		Fly aFly = new Fly(flyName);
		ant.eat(aFly);
		ant.whatDidYouEat();
		if (ant.obtainCurrentMealLog().equals(didFlyEatExpectedOutput)) {
			System.out.println("didFlyEatExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("didFlyEatExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testEatingThingExpectedOutput() {
		Ant ant = new Ant(antName);
		Thing aThing = new Thing(thingName);
		ant.eat(aThing);
		if (ant.obtainCurrentMealLog().equals(thingEatingExpectedOutput)) {
			System.out.println("thingEatingExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("thingEatingExpectedOutput has FAILED testing.");
		}
		
	}
	
	public static void testHasEatenThingExpectedOutput() {
		Ant ant = new Ant(antName);
		Thing aThing = new Thing(thingName);
		ant.eat(aThing);
		ant.whatDidYouEat();
		if (ant.obtainCurrentMealLog().equals(didThingEatExpectedOutput)) {
			System.out.println("didThingEatExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("didThingEatExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testEatingTigerExpectedOutput() {
		Ant ant = new Ant(antName);
		Tiger aTiger = new Tiger(tigerName);
		ant.eat(aTiger);
		if (ant.obtainCurrentMealLog().equals(tigerEatingExpectedOutput)) {
			System.out.println("tigerEatingExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("tigerEatingExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testHasEatenTigerExpectedOutput() {
		Ant ant = new Ant(antName);
		Tiger aTiger = new Tiger(tigerName);
		ant.eat(aTiger);
		ant.whatDidYouEat();
		if (ant.obtainCurrentMealLog().equals(didTigerEatExpectedOutput)) {
			System.out.println("didTigerEatExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("didTigerEatExpectedOutput has FAILED testing.");
		}
	}
	
	
	public static void testMovingExpectedOutput() {
		Ant ant = new Ant(antName);
		ant.move();
		if (ant.getMoveString().equals(moveExpectedOutput)) {
			System.out.println("moveExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("moveExpectedOutput has FAILED testing.");
		}
	}
	
	public static void testHasNotEatenAnythingYetExpectedOutput() {
		Ant ant = new Ant(antName);
		if (ant.obtainCurrentMealLog().equals(didNotEatExpectedOutput)) {
			System.out.println("didNotEatExpectedOutput SUCCESSFULLY PASSED testing");
		}else {
			System.out.println("didNotEatExpectedOutput has FAILED testing.");
		}
	}


}