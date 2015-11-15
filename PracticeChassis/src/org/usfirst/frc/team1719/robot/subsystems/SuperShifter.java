package org.usfirst.frc.team1719.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SuperShifter extends Subsystem{

	private Relay drivingRelay;
	public SuperShifter(Relay relay){
		this.drivingRelay = relay;
	}
	
	
	
	@Override
	protected void initDefaultCommand() {
		// Do nothing
		
	}

	
	
	
	
	
}
