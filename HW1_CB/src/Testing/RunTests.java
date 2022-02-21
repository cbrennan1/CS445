package main.Testing;

public class RunTests {
	public static void main(String[] args) {
		System.out.println("Unit Testing by Colin Brennan:\n");
		System.out.println("Testing for Ant");
		Testing.TestingforAnt.testEatingAntExpectedOutput();
		Testing.TestingforAnt.testHasEatenAntExpectedOutput();
		Testing.TestingforAnt.testEatingBatExpectedOutput();
		Testing.TestingforAnt.testHasEatenBatExpectedOutput();
		Testing.TestingforAnt.testEatingFlyExpectedOutput();
		Testing.TestingforAnt.testHasEatenFlyExpectedOutput();
		Testing.TestingforAnt.testEatingThingExpectedOutput();
		Testing.TestingforAnt.testHasEatenThingExpectedOutput();
		Testing.TestingforAnt.testEatingTigerExpectedOutput();
		Testing.TestingforAnt.testHasEatenTigerExpectedOutput();
		Testing.TestingforAnt.testMovingExpectedOutput();
		Testing.TestingforAnt.testHasNotEatenAnythingYetExpectedOutput();
		System.out.println("Testing for Ant Completed\n");
		
		System.out.println("Testing for Bat");
		Testing.TestingforBat.testEatingAntExpectedOutput();
		Testing.TestingforBat.testHasEatenAntExpectedOutput();
		Testing.TestingforBat.testEatingBatExpectedOutput();
		Testing.TestingforBat.testHasEatenBatExpectedOutput();
		Testing.TestingforBat.testEatingFlyExpectedOutput();
		Testing.TestingforBat.testHasEatenFlyExpectedOutput();
		Testing.TestingforBat.testEatingTigerExpectedOutput();
		Testing.TestingforBat.testHasEatenTigerExpectedOutput();
		Testing.TestingforBat.testMovingExpectedOutput();
		Testing.TestingforBat.testFlyingExpectedOutput();
		Testing.TestingforBat.testHasNotEatenAnythingYetExpectedOutput();
		System.out.println("Testing for Bat Completed\n");
		
		System.out.println("Testing for Tiger");
		Testing.TestingforTiger.testEatingAntExpectedOutput();
		Testing.TestingforTiger.testHasEatenAntExpectedOutput();
		Testing.TestingforTiger.testEatingBatExpectedOutput();
		Testing.TestingforTiger.testHasEatenBatExpectedOutput();
		Testing.TestingforTiger.testEatingFlyExpectedOutput();
		Testing.TestingforTiger.testHasEatenFlyExpectedOutput();
		Testing.TestingforTiger.testEatingThingExpectedOutput();
		Testing.TestingforTiger.testHasEatenThingExpectedOutput();
		Testing.TestingforTiger.testEatingTigerExpectedOutput();
		Testing.TestingforTiger.testHasEatenTigerExpectedOutput();
		Testing.TestingforTiger.testMovingExpectedOutput();
		Testing.TestingforTiger.testHasNotEatenAnythingYetExpectedOutput();
		System.out.println("Testing for Tiger Completed\n");
		
		System.out.println("Testing for Fly");
		Testing.TestingforFly.testEatingThingExpectedOutput();
		Testing.TestingforFly.testHasEatenThingExpectedOutput();
		Testing.TestingforFly.testMovingExpectedOutput();
		Testing.TestingforFly.testHasNotEatenAnythingYetExpectedOutput();
		System.out.println("Testing for Fly Completed\n");
		
		System.out.println("Testing for Thing");
		Testing.TestingforThing.testToString();
		System.out.println("Testing for Thing Completed\n");
		System.out.println("All Testing Completed");
	}
}
