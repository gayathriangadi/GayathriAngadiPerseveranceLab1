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
public class ObstacleSensor implements SelfCheckCapable {
	String Camera;
	
	/**
	 * This method senses light
	 */
	void lighttracking() {
		
	}

	/**
	 * This method senses line
	 */
	void linetracking() {
		
	}
	
	/**
	 * This method senses obstacle
	 */
	void obstacletracking() {
		
	}
	
	/**
	 * This method detect face
	 */
	
	void facetracking() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Obstacle detected";
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
