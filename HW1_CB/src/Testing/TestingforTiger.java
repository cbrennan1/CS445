package Testing;

import Main.Ant;
import Main.Bat;
import Main.Fly;
import Main.Thing;
import Main.Tiger;

public class TestingforTiger {

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
				tigerName = "Bob Marley";
				tigerEatingExpectedOutput = tigerName + " Tiger has just eaten a Tiger" ;
				didTigerEatExpectedOutput = tigerName + " Tiger has eaten a Tiger";
				
				batName = "Bruce Wayne";
				batEatingExpectedOutput = tigerName+ " Tiger has just eaten a Bat" ;
				didBatEatExpectedOutput = tigerName+ " Tiger has eaten a Bat";
				
				antName = "Bob the Builder";
				antEatingExpectedOutput = tigerName+ " Tiger has just eaten a Ant" ;
				didAntEatExpectedOutput = tigerName+ " Tiger has eaten a Ant";
				
				flyName = "Frozone";
				flyEatingExpectedOutput = tigerName + " Tiger has just eaten a Fly" ;
				didFlyEatExpectedOutput = tigerName + " Tiger has eaten a Fly";
				
				thingName = "Barry Allen";
				thingEatingExpectedOutput = tigerName + " Tiger has just eaten a Thing" ;
				didThingEatExpectedOutput = tigerName + " Tiger has eaten a Thing";
				
				
				moveExpectedOutput = tigerName + " Tiger has just pounced.";
				didNotEatExpectedOutput = tigerName + " Tiger has had nothing to eat!";
			}
			 
			public static void testEatingAntExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Ant aAnt = new Ant(antName);
				tiger.eat(aAnt);
				if (tiger.obtainCurrentMealLog().equals(antEatingExpectedOutput)) {
					System.out.println("antEatingExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("antEatingExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testHasEatenAntExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Ant aAnt = new Ant(antName);
				tiger.eat(aAnt);
				tiger.whatDidYouEat();
				if (tiger.obtainCurrentMealLog().equals(didAntEatExpectedOutput)) {
					System.out.println("didAntEatExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("didAntEatExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testEatingBatExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Bat aBat = new Bat(batName);
				tiger.eat(aBat);
				if (tiger.obtainCurrentMealLog().equals(batEatingExpectedOutput)) {
					System.out.println("batEatingExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("batEatingExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testHasEatenBatExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Bat aBat = new Bat(batName);
				tiger.eat(aBat);
				tiger.whatDidYouEat();
				if (tiger.obtainCurrentMealLog().equals(didBatEatExpectedOutput)) {
					System.out.println("didBatEatExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("didBatEatExpectedOutput has FAILED testing.");
				};
			}
				 
			public static void testEatingFlyExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Fly aFly = new Fly(flyName);
				tiger.eat(aFly);
				if (tiger.obtainCurrentMealLog().equals(flyEatingExpectedOutput)) {
					System.out.println("flyEatingExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("flyEatingExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testHasEatenFlyExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Fly aFly = new Fly(flyName);
				tiger.eat(aFly);
				tiger.whatDidYouEat();
				if (tiger.obtainCurrentMealLog().equals(didFlyEatExpectedOutput)) {
					System.out.println("didFlyEatExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("didFlyEatExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testEatingThingExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Thing aThing = new Thing(thingName);
				tiger.eat(aThing);
				if (tiger.obtainCurrentMealLog().equals(thingEatingExpectedOutput)) {
					System.out.println("thingEatingExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("thingEatingExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testHasEatenThingExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Thing aThing = new Thing(thingName);
				tiger.eat(aThing);
				tiger.whatDidYouEat();
				if (tiger.obtainCurrentMealLog().equals(didThingEatExpectedOutput)) {
					System.out.println("didThingEatExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("didThingEatExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testEatingTigerExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Tiger aTiger = new Tiger(tigerName);
				tiger.eat(aTiger);
				if (tiger.obtainCurrentMealLog().equals(tigerEatingExpectedOutput)) {
					System.out.println("tigerEatingExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("tigerEatingExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testHasEatenTigerExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				Tiger aTiger = new Tiger(tigerName);
				tiger.eat(aTiger);
				tiger.whatDidYouEat();
				if (tiger.obtainCurrentMealLog().equals(didTigerEatExpectedOutput)) {
					System.out.println("didTigerEatExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("didTigerEatExpectedOutput has FAILED testing.");
				};

			}
			 
			public static void testMovingExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				tiger.move();
				if (tiger.getMoveString().equals(moveExpectedOutput)) {
					System.out.println("moveExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("moveExpectedOutput has FAILED testing.");
				};
			}
			
			 
			public static void testHasNotEatenAnythingYetExpectedOutput() {
				Tiger tiger = new Tiger(tigerName);
				if (tiger.obtainCurrentMealLog().equals(didNotEatExpectedOutput)) {
					System.out.println("didNotEatExpectedOutput SUCCESSFULLY PASSED testing.");
				}else {
					System.out.println("didNotEatExpectedOutput has FAILED testing.");
				};
			}
}
