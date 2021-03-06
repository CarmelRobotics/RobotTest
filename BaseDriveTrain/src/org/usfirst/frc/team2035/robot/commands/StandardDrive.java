package org.usfirst.frc.team2035.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.DriveTrain;

/**
 *
 */
public class StandardDrive extends CommandBase {

	private Joystick joystick;
    private RobotDrive drive;
    private DriveTrain theDriveTrain;
    
    public StandardDrive(RobotDrive d, Joystick j) {
    	super("StandardDrive");
        theDriveTrain = Robot.getDriveTrain();
        requires(theDriveTrain);
        joystick = j;
        drive = d;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	 theDriveTrain.arcadeDrive(joystick);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	drive.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
