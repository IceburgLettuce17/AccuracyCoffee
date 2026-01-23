package accuracycoffee.tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.microedition.lcdui.Display;

import accuracycoffee.AccuracyCoffee;
import accuracycoffee.Test;

/**
 * Display has a niche method that not many emulators like to emulate: <b>getBorderStyle(boolean)</b>.
 * <br>This test calls that method and gets its return value.
 * <br>If the returned value is not Graphics.DOTTED or Graphics.SOLIDs, return ERROR_STUBBED.
 * Else, return TEST_PASS (except for KEmulator)
 * <br>NOTE: KEmulator returns a valid value for this method (0 a.k.a. Graphics.SOLID)s, so I added a stub condition just for it
 */
public class BorderStyleTest extends Test 
{
	public int perform() throws SecurityException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException 
	{
		AccuracyCoffee.setClass("javax.microedition.lcdui.Display");
		if (AccuracyCoffee.currentClass == null) 
			{System.out.println("class == null"); return TEST_FAIL;}
		Method meth = AccuracyCoffee.currentClass.getDeclaredMethod("getBorderStyle", new Class<?>[]{boolean.class});
		if (meth == null) {System.out.println("method == null"); return TEST_FAIL;}
		// setAccessible(true) in the edge case getBorderStyle is private
		meth.setAccessible(true);
		Integer ret = (Integer)meth.invoke(Display.getDisplay(AccuracyCoffee.midlet), new Object[]{new Boolean(false)});
		int value = ret.intValue();
		
		boolean kemu = false;
		// KEmulator returns 0 for getBorderStyle as of now, so I will use a workaround
		if (AccuracyCoffee.isKEmulator() && value == 0)
		{
			kemu = true;
		}
		
		int result = value;
		
		// For the aforementioned problem
		if (value == 0 && kemu)
		{
			result = ERROR_STUBBED;
			error = true;
		}
		
		// Pass condition (value is 0 (Graphics.SOLID) on anything except KEmulator or value is 1 (Graphics.DOTTED)
		if (value == 0 && !kemu || value == 1)
		{
			result = TEST_PASS;
			pass = true;
		}
		
		// Fail condition
		else
		{
			result = TEST_FAIL;
			fail = true;
		}
		
		if (result != TEST_PASS) errorCode = result;
		retValue = result;
		return result;
	}
	
	public BorderStyleTest() {}

}
