package org.usfirst.frc.team3467.robot.triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

/**
 * A custom button that is triggered when two buttons on a Joystick are
 * simultaneously pressed.
 */
public class SingleButtonandIgnoreOtherButton extends Trigger {
	private Joystick joy;
	private int button1, button2;
	boolean triggerstate;
	
	public SingleButtonandIgnoreOtherButton(Joystick joy, int button1, int button2) {
		this.joy = joy;
		this.button1 = button1;
		this.button2 = button2;

	}	
    
    public boolean get() {
    	if((joy.getRawButton(button1) == true) && (joy.getRawButton(button2) == false)){
    		triggerstate = true;
    	}
    	else{
    		triggerstate = false;
    	}
        return triggerstate;
    }
}