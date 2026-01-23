package accuracycoffee;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.midlet.MIDlet;

import accuracycoffee.tests.BorderStyleTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Checks the accuracy of your J2ME environment using various tests.
 */
public class AccuracyCoffee extends Canvas implements Runnable
{
	public static Graphics g;
	public static MIDlet midlet;
	public static Display display;
	
	public static Class<?> currentClass;
	
	public AccuracyCoffee(MIDlet midlet) 
	{
		AccuracyCoffee.midlet = midlet;
		display = Display.getDisplay(midlet);
		repaint();
	}

	public void run() 
	{
		repaint();
		System.out.println("Hello World");
	}

	public void paint(Graphics _g) 
	{
		repaint();
		g = _g;
		g.setColor(0x0000000);
		g.drawString("AccuracyCoffee PROTOTYPE", 1, 1, Graphics.LEFT | Graphics.TOP);
		BorderStyleTest bt = new BorderStyleTest();
		TestLoader.loadTest(bt);
		System.out.println("Test Status" + convertRetValues(bt));
	}
	
	public static String convertRetValues(Test test)
	{
		int value = test.retValue;
		if (value == Test.ERROR_STUBBED) return "Error Code 0 - Method stubbed";
		if (value == Test.TEST_PASS) return "Error Code 128785687 - Passed";
		if (value == Test.TEST_FAIL) return "Error Code -99516841 - FAILED!";
		return "Error Code ~~~ = Unknown Return";
		
	}
	public static void setClass(String cls) throws ClassNotFoundException
	{
		currentClass = Class.forName(cls);
	}
	
	public static boolean isKEmulator() throws ClassNotFoundException
	{
		// Using an obvious unobfuscated class name here
		return Class.forName("emulator.Emulator") != null;
	}
}