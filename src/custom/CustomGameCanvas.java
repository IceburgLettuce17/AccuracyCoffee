package custom;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.midlet.MIDlet;

/**
 * My variant of GameCanvas that has Unity-like methods to implement.
 */
public abstract class CustomGameCanvas extends GameCanvas implements Runnable
{
	/**
	 * This canvas's own Graphics.
	 */
	public static Graphics g;
	
	/**
	 * This canvas's last Graphics.
	 */
	public static Graphics gLast;
	
	/**
	 * The MIDlet to use.
	 */
	public static MIDlet midlet;
	
	/**
	 * The Display to use.
	 */
	public static Display display;
	
	public void run()
	{
		start();
	}
	
	public CustomGameCanvas(boolean duper, MIDlet midlet, Display display)
	{
		super(duper); // pooper
		CustomGameCanvas.midlet = midlet;
		CustomGameCanvas.display = display;
	}
	public void paint(Graphics arg0)
	{
		try
		{
			gLast = g;
			g = arg0;
			update();
		}
		catch (Exception e)
		{
			System.out.println("Failed to paint!");
			e.printStackTrace();
			
		}
	}
	/**
	 * Called once every frame update.
	 */
	public abstract void start();
	
	/**
	 * Called once per frame.
	 */
	public abstract void update();
	
	public void quit()
	{
		onDestroy();
		midlet.notifyDestroyed();
	}
	/**
	 * Called when quitting.
	 */
	public abstract void onDestroy();
}
