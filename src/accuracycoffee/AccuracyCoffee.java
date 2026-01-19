package accuracycoffee;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * This MIDlet checks the accuracy of your J2ME environment using various tests.
 */
public final class AccuracyCoffee extends MIDlet 
{
	/**
	 * The instance of the MIDlet (used in other classes)
	 */
	public static AccuracyCoffee instance;
	
	/**
	 * Used to draw text and do other stuff.
	 */
	public static Graphics g;
	
	public AccuracyCoffee() 
	{
		instance = this;
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

}
