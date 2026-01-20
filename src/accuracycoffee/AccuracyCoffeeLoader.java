package accuracycoffee;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * Just a wrapper that loads AccuracyCoffee.
 */
public final class AccuracyCoffeeLoader extends MIDlet 
{
	/**
	 * The instance of the MIDlet (used in other classes).
	 */
	public static AccuracyCoffeeLoader instance;
	
	/** 
	 * The main class itself.
	 */
	public static AccuracyCoffee main;
	
	/** 
	 * The display.
	 */
	public static Display display;

	public AccuracyCoffeeLoader() 
	{
		instance = this;
		main = new AccuracyCoffee(this);
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {

	}

	protected void pauseApp() {
		notifyPaused();

	}

	protected void startApp() throws MIDletStateChangeException 
	{
		if (display == null)
		{
			display = Display.getDisplay(this);
		}
		display.setCurrent(main);
	}
}