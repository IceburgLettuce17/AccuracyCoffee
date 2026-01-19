package accuracycoffee;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

import custom.CustomGameCanvas;

/**
 * Checks the accuracy of your J2ME environment using various tests.
 */
public class AccuracyCoffee extends CustomGameCanvas
{
	int test;
	
	public AccuracyCoffee(boolean duper, MIDlet midlet, Display display) 
	{
		super(duper, midlet, display);
	}

	public void start() 
	{
		System.out.println("Hello World");
	}

	public void update() 
	{
		test++;
		
		if (test > 10)
			test = 9;
	}

	public void onDestroy() 
	{
		
	}


}
