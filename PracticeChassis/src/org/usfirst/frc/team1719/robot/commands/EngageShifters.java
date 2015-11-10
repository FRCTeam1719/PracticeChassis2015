package org.usfirst.frc.team1719.robot.commands;

import org.usfirst.frc.team1719.robot.subsystems.SuperShifter;

import edu.wpi.first.wpilibj.command.Command;

public class EngageShifters extends Command{

	
	@Override
	protected void initialize() {
		
		
	}

	@Override
	protected void execute() {
		SuperShifter.engageShifters();
		
	}

	@Override
	protected boolean isFinished() {
		
		return true;
	}

	@Override
	protected void end() {
		
		
	}

	@Override
	protected void interrupted() {
		
		
	}

}
