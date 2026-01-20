package accuracycoffee;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.midlet.MIDlet;

/**
 * Checks the accuracy of your J2ME environment using various tests.
 */
public class AccuracyCoffee extends Canvas implements Runnable
{
	public static Graphics g;
	public static MIDlet midlet;
	public static Display display;
	
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
		g.drawString("50 Tests", 1, 1, Graphics.LEFT | Graphics.TOP);
	}
}
