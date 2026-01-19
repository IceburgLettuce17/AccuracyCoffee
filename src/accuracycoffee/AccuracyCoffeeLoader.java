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

	public AccuracyCoffeeLoader() 
	{
		instance = this;
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException 
	{
		main = new AccuracyCoffee(false, instance, Display.getDisplay(instance));
		main.start();

}
