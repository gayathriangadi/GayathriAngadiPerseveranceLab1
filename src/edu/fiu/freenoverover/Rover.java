/**
 * 
 */
package edu.fiu.freenoverover;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author gayat
 *
 */
public class Rover implements SelfCheckCapable {
	String name;
	
	/**
	 * This start method starts the rover to receive instructions from the user
	 *
	 */
	void start() {
		
	}
	
	/**
	 * This stop method stops the rover
	 */
	void stop() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Rover On";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents();
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
