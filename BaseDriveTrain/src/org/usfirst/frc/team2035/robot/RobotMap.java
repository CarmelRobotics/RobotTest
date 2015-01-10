package org.usfirst.frc.team2035.robot;

import edu.wpi.first.wpilibj.Joystick;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int FLeftMotorPWM = 0; // Front Left drive motor is wired to PWM out 1
    public static final int BLeftMotorPWM = 1; // Rear Left drive motor is wired to PWM out 2
    public static final int FRightMotorPWM = 2; // Front Right drive motor is wired to PWM out 3
    public static final int BRightMotorPWM = 3; // Rear Right drive motor is wired to PWM out 4 
    
    public static final Joystick DriverJoystick = new Joystick(1);
}
