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
public class Power implements SelfCheckCapable {
	String Battery;
	
	/**
	 * This Voltage method provides voltage for the Rover Battery to run
	 */
	void Voltage() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Battery Okay";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(null);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
