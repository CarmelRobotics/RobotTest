package org.usfirst.frc.team2035.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import org.usfirst.frc.team2035.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Jaguar;
import org.usfirst.frc.team2035.robot.commands.StandardDrive;
/**
 *
 */
public class DriveTrain extends Subsystem {
    
	   private final RobotDrive drive;
	    //private final RobotDrive drive6;
	    private final Jaguar FLeftMotor;
	    private final Jaguar BLeftMotor;
	    private final Jaguar FRightMotor;
	    private final Jaguar BRightMotor;

	    public DriveTrain() {
	        super("DriveTrain");

	        FLeftMotor = new Jaguar(RobotMap.FLeftMotorPWM);
	        FRightMotor = new Jaguar(RobotMap.FRightMotorPWM);
	        BLeftMotor = new Jaguar(RobotMap.BLeftMotorPWM);
	        BRightMotor = new Jaguar(RobotMap.BRightMotorPWM);
	        //MLeftMotor = new Jaguar(RobotMap.MLeftMotorPWM);
	        //MRightMotor = new Jaguar(RobotMap.MRightMotorPWM);
	        drive = new RobotDrive(FLeftMotor, BLeftMotor, FRightMotor, BRightMotor);
	    }
	    
	    public void initDefaultCommand() {
	        super.setDefaultCommand(new StandardDrive(drive, RobotMap.DriverJoystick));
	        
	    }
	    
	    public void arcadeDrive(Joystick j) {
	        drive.arcadeDrive(j.getY(), j.getX());
	    }
	    
	    public RobotDrive getDrive() {
	        return drive;
	    }
}

