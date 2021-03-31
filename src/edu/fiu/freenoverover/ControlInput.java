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
public class ControlInput implements SelfCheckCapable {
	String Android;
	String iphone;
	String computer;

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Device detected";
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
