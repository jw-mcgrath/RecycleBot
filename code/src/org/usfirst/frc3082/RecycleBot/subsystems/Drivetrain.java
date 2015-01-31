// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3082.RecycleBot.subsystems;

import org.usfirst.frc3082.RecycleBot.RobotMap;
import org.usfirst.frc3082.RecycleBot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drivetrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftFront = RobotMap.drivetrainLeftFront;
    SpeedController leftBack = RobotMap.drivetrainLeftBack;
    SpeedController rightFront = RobotMap.drivetrainRightFront;
    SpeedController rightBack = RobotMap.drivetrainRightBack;
    RobotDrive robotDrive = RobotMap.drivetrainRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new Drive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void drive(double magnitude, double direction, double rotation){
    	robotDrive.mecanumDrive_Polar(magnitude, direction, rotation);
    }
    public void stop(){
    	robotDrive.mecanumDrive_Polar(0, 0, 0);
    }
}

