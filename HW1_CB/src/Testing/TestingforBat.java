package Testing;
import Main.Ant;
import Main.Bat;
import Main.Fly;
import Main.Tiger;

public class TestingforBat {
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
		
		private final static String tigerName;
		private final static String tigerEatingExpectedOutput;
		private final static String didTigerEatExpectedOutput;
		
		private final static String moveExpectedOutput;
		private final static String didNotEatExpectedOutput;
			
		static {
			batName = "Bruce Wayne";
			batEatingExpectedOutput = batName+ " Bat has just eaten a Bat" ;
			didBatEatExpectedOutput = batName+ " Bat has eaten a Bat";
			
			antName = "Bob the Builder";
			antEatingExpectedOutput = batName+ " Bat has just eaten a Ant" ;
			didAntEatExpectedOutput = batName+ " Bat has eaten a Ant";
			
			flyName = "Frozone";
			flyEatingExpectedOutput = batName + " Bat has just eaten a Fly" ;
			didFlyEatExpectedOutput = batName + " Bat has eaten a Fly";
			
			tigerName = "Bob Marley";
			tigerEatingExpectedOutput = batName + " Bat has just eaten a Tiger" ;
			didTigerEatExpectedOutput = batName + " Bat has eaten a Tiger";
			
			moveExpectedOutput = batName + " Bat is swooping through the dark.";
			didNotEatExpectedOutput = batName + " Bat has had nothing to eat!";
		}
			
		public static void testEatingAntExpectedOutput() {
			Bat bat = new Bat(batName);
			Ant aAnt = new Ant(antName);
			bat.eat(aAnt);
			if (bat.obtainCurrentMealLog().equals(antEatingExpectedOutput)) {
				System.out.println("antEatingExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("antEatingExpectedOutput has FAILED testing.");
			}
		}
		
		 
		public static void testHasEatenAntExpectedOutput() {
			Bat bat = new Bat(batName);
			Ant aAnt = new Ant(antName);
			bat.eat(aAnt);
			bat.whatDidYouEat();
			if (bat.obtainCurrentMealLog().equals(didAntEatExpectedOutput)) {
				System.out.println("didAntEatExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("didAntEatExpectedOutput has FAILED testing.");
			};
		}
		
		 
		public static void testEatingBatExpectedOutput() {
			Bat bat = new Bat(batName);
			Bat aBat = new Bat(batName);
			bat.eat(aBat);
			if (bat.obtainCurrentMealLog().equals(batEatingExpectedOutput)) {
				System.out.println("batEatingExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("batEatingExpectedOutput has FAILED testing.");
			};
		}
		
		 
		public static void testHasEatenBatExpectedOutput() {
			Bat bat = new Bat(batName);
			Bat aBat = new Bat(batName);
			bat.eat(aBat);
			bat.whatDidYouEat();
			if (bat.obtainCurrentMealLog().equals(didBatEatExpectedOutput)) {
				System.out.println("didBatEatExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("didBatEatExpectedOutput has FAILED testing.");
			};
		}
		
		public static void testEatingFlyExpectedOutput() {
			Bat bat = new Bat(batName);
			Fly aFly = new Fly(flyName);
			bat.eat(aFly);
			if (bat.obtainCurrentMealLog().equals(flyEatingExpectedOutput)) {
				System.out.println("flyEatingExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("flyEatingExpectedOutput has FAILED testing.");
			};
		}
		
		public static void testHasEatenFlyExpectedOutput() {
			Bat bat = new Bat(batName);
			Fly aFly = new Fly(flyName);
			bat.eat(aFly);
			bat.whatDidYouEat();
			if (bat.obtainCurrentMealLog().equals(didFlyEatExpectedOutput)) {
				System.out.println("didFlyEatExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("didFlyEatExpectedOutput has FAILED testing.");
			};
		}
		
		
		public static void testEatingTigerExpectedOutput() {
			Bat bat = new Bat(batName);
			Tiger aTiger = new Tiger(tigerName);
			bat.eat(aTiger);
			if (bat.obtainCurrentMealLog().equals(tigerEatingExpectedOutput)) {
				System.out.println("tigerEatingExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("tigerEatingExpectedOutput has FAILED testing.");
			};
		}
		
		public static void testHasEatenTigerExpectedOutput() {
			Bat bat = new Bat(batName);
			Tiger aTiger = new Tiger(tigerName);
			bat.eat(aTiger);
			bat.whatDidYouEat();
			if (bat.obtainCurrentMealLog().equals(didTigerEatExpectedOutput)) {
				System.out.println("didTigerEatExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("didTigerEatExpectedOutput has FAILED testing.");
			};
		}

		public static void testMovingExpectedOutput() {
			Bat bat = new Bat(batName);
			bat.move();
			if (bat.obtainMoveString().equals(moveExpectedOutput)) {
				System.out.println("moveExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("moveExpectedOutput has FAILED testing.");
			};
		}
		
		 
		public static void testFlyingExpectedOutput() {
			Bat bat = new Bat(batName);
			bat.fly();
			if (bat.obtainMoveString().equals(moveExpectedOutput)) {
				System.out.println("moveExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("moveExpectedOutput has FAILED testing.");
			};
		}
		
		 
		public static void testHasNotEatenAnythingYetExpectedOutput() {
			Bat bat = new Bat(batName);
			if (bat.obtainCurrentMealLog().equals(didNotEatExpectedOutput)) {
				System.out.println("didNotEatExpectedOutput SUCCESSFULLY PASSED testing.");
			}else {
				System.out.println("didNotEatExpectedOutput has FAILED testing.");
			};
		}
}