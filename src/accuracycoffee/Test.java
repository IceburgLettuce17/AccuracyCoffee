package accuracycoffee;

import java.lang.reflect.InvocationTargetException;

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
	 * Test was failed (returned in perform())
	 * <br>Spells out FAILTEST
	 */
	public static final int TEST_FAIL = 0xFA117E57;
	
	/**
	 * Test was passed (returned in perform())
	 * <br>Spells out YADIDIT
	 */
	public static final int TEST_PASS = 0x7AD1D17;
	 
	/**
	 * The error code that the test returned.
	 */
	public static int errorCode;
	
	/**
	 * Did the test pass?
	 */
	public static boolean pass;
	
	/**
	 * Did the test error?
	 */
	public static boolean error;
	
	/**
	 * Did the test fail?
	 */
	public static boolean fail;
	
	/**
	 * The return value of perform().
	 */
	public int retValue;
	
	/**
	 * Performs the test.
	 * @return the error code of the test if it errored, TEST_PASS otherwise (Returns TEST_FAIL for a failing condition)
	 * @throws NoSuchMethodException when method isn't found
	 * @throws SecurityException for permissions
	 * @throws ClassNotFoundException when class isn't found
	 * @throws InvocationTargetException if the method target is invalid
	 * @throws IllegalAccessException when the way the method is accessed is not allowed
	 * @throws IllegalArgumentException when the arguments passed to method are invalid
	 */
	public abstract int perform() throws SecurityException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException;

}
