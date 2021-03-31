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
public class Visual implements SelfCheckCapable {
	String Camera;
	
	/**
	 * This method takes picture
	 */
	void picture() {
		
	}
	
	/**
	 * This method captures Video
	 */
	void Video() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Picture and Video captured";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents();
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

}
