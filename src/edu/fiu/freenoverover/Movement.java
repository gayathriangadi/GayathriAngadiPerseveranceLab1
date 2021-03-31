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
public class Movement implements SelfCheckCapable {
	String Motor;
	String Wheel;
	
	/**
	 * This method will instruct the rover to move forward
	 */
	void moveforward() {
		
	}
	
	/**
	 * This method will instruct the rover to backward
	 */
	void movebackward() {
		
	}
	
	/**
	 * This method will instruct the rover to turn right
	 */
	void turnright() {
		
	}
	
	/**
	 * This method will instruct the rover to turn left
	 */
	void turnleft() {
		
	}
	
	/**
	 * This method will apply brakes
	 */

	void brake() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Rover moving";
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
