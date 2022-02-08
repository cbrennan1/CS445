package Testing;


import Main.Fly;
import Main.Thing;


public class TestingforFly {
	// String fixtures
		private final static String flyName;	
			
		private final static String thingName;
		private final static String thingEatingExpectedOutput;
		private final static String didThingEatExpectedOutput;
		
		private final static String moveExpectedOutput;
		private final static String didNotEatExpectedOutput;
			
		
		static {
			flyName = "Frozone";
					
			thingName = "Barry Allen";
			thingEatingExpectedOutput = flyName + " Fly has just eaten a Thing" ;
			didThingEatExpectedOutput = flyName + " Fly has eaten a Thing";
			
			moveExpectedOutput = flyName + " Fly is buzzing around in flight.";
			didNotEatExpectedOutput = flyName + " Fly has had nothing to eat!";
		}

		 
		public static void testEatingThingExpectedOutput() {
			Fly fly = new Fly(flyName);
			Thing aThing = new Thing(thingName);
			fly.eat(aThing);
			if (fly.obtainCurrentMealLog().equals(thingEatingExpectedOutput)) {
				System.out.println("thingEatingExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("thingEatingExpectedOutput has FAILED testing.");
			};
		}
		
		 
		public static void testHasEatenThingExpectedOutput() {
			Fly fly = new Fly(flyName);
			Thing aThing = new Thing(thingName);
			fly.eat(aThing);
			fly.whatDidYouEat();
			if (fly.obtainCurrentMealLog().equals(didThingEatExpectedOutput)) {
				System.out.println("didThingEatExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("didThingEatExpectedOutput has FAILED testing.");
			};
		}
		
		
		 
		public static void testMovingExpectedOutput() {
			Fly fly = new Fly(flyName);
			fly.move();
			if (fly.obtainMoveString().equals(moveExpectedOutput)) {
				System.out.println("moveExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("moveExpectedOutput has FAILED testing.");
			};
		}
		
		 
		public static void testHasNotEatenAnythingYetExpectedOutput() {
			Fly fly = new Fly(flyName);
			if (fly.obtainCurrentMealLog().equals(didNotEatExpectedOutput)) {
				System.out.println("didNotEatExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("didNotEatExpectedOutput has FAILED testing.");
			};
		}

	}