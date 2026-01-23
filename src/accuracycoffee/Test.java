package accuracycoffee;

/**
 * A base test class that returns a value depending if it passed or failed. 
 * To make your own test, derive from this class.
 */
public abstract class Test 
{
	//// Default Error Codes //// 
	
	/**
	 * Method is stubbed (returns null, 0/-1, false)
	 */
	public static final int ERROR_STUBBED = 0;
	
	/**
	 * Test was passed (returned in perform())
	 */
	public static final int TEST_PASS = 0xDEADD00D;
	 
	/**
	 * The error code that the test returned.
	 */
	public static int errorCode;
	
	/**
	 * Did the test pass?
	 */
	public static boolean pass;
	
	/**
	 * Did the test fail?
	 */
	public static boolean fail;
	
	/**
	 * Performs the tests
	 * @return the error code of the test if it failed, TEST_PASS otherwise
	 */
	public abstract int perform();

}
