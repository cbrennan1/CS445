package Testing;

import Main.Thing;

public class TestingforThing{
	// String fixtures
	private final static String thingName;
	private final static String toStringExpectedOutput;

	static {
		thingName = "Colin";
		toStringExpectedOutput = thingName;
	}
	
	public static void testToString() {
		Thing thing = new Thing(thingName);
		if (thing.toString().equals(toStringExpectedOutput)) {
			System.out.println("toStringExpectedOutput SUCCESSFULLY PASSED testing.");
		}else {
			System.out.println("toStringExpectedOutput has FAILED testing.");
		}
	}

}
