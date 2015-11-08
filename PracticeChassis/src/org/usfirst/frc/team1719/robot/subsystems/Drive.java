package org.usfirst.frc.team1719.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem{

	public RobotDrive robotDrive;
	
	public Drive(SpeedController right, SpeedController left){
		robotDrive = new RobotDrive(right,left);
		
		robotDrive.setSafetyEnabled(true);
        robotDrive.setExpiration(0.1);
        robotDrive.setSensitivity(0.5);
        robotDrive.setMaxOutput(1.0);
        
		
	}
	
	public void DriveTank(double left, double right){
		robotDrive.tankDrive(left,right);
	}
	
	
	@Override
	protected void initDefaultCommand() {
		
		
	}
	
	
	
	
	
	

}
