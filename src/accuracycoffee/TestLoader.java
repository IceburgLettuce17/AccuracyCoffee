package accuracycoffee;

import java.lang.reflect.InvocationTargetException;

public class TestLoader
{
	static int r;
	static boolean threwEx;
	
	public static void loadTest(Test test)
	{
		try {
			r = test.perform();
		} catch (SecurityException e) {
			e.printStackTrace(); threwEx = true;
		} catch (IllegalArgumentException e) {
			e.printStackTrace(); threwEx = true;
		} catch (NoSuchMethodException e) {
			e.printStackTrace(); threwEx = true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); threwEx = true;
		} catch (IllegalAccessException e) {
			e.printStackTrace(); threwEx = true;
		} catch (InvocationTargetException e) {
			e.printStackTrace(); threwEx = true;
		}
	}
}
