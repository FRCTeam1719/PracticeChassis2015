package org.usfirst.frc.team1719.robot.subsystems;

import org.usfirst.frc.team1719.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class SuperShifter extends Subsystem{

	boolean currentState = false;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public static void engageShifters(){
		RobotMap.leftShifter.set(true);
		RobotMap.rightShifter.set(true);
	}
	public static void disengageShifters(){
		RobotMap.leftShifter.set(false);
		RobotMap.rightShifter.set(false);
	}
	
	
	

}
