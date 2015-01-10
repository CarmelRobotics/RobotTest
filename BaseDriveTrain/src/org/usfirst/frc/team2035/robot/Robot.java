package org.usfirst.frc.team2035.robot;

import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
//import org.usfirst.frc.team2035.robot.commands.CommandBase;
import org.usfirst.frc.team2035.robot.subsystems.*;
//import edu.wpi.first.wpilibj.DriverStationLCD.Line;
//import edu.wpi.first.wpilibj.DriverStationLCD;
//import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DriverStation;

public class Robot extends RobotBase{

	Command autonomousCommand;
    private static DriveTrain DriveTrain;
    //private int pattern;
    public static DriverStation driverStation;
    //private boolean digital1;
    //private boolean digital2;
    //private boolean digital3;
    //private int alliance;
    
    public static DriveTrain getDriveTrain() {
        return DriveTrain;
    }
    
    public void robotInit() {
        // instantiate the command used for the autonomous period
        DriveTrain = new DriveTrain();
        //OI.initialize();
        driverStation = DriverStation.getInstance();
        //CommandBase.initialize();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }

	@Override
	public void startCompetition() {
		// TODO Auto-generated method stub
		
	}

}
