
package org.usfirst.frc.team1719.robot.commands;

import org.usfirst.frc.team1719.robot.OI;
import org.usfirst.frc.team1719.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UseDrive extends Command {
	final double TOLERANCE = 0.3D;
	

    public UseDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double rightMovement = OI.getDriveRight();
    	double leftMovement = OI.getDriveLeft();
    	
    	//Make sure the values are above the tolerance
    	if(Math.abs(rightMovement)<=TOLERANCE){rightMovement=0;}
    	if(Math.abs(leftMovement)<=TOLERANCE){leftMovement=0;}
    	
    	//Pass values to the drive subsystem
    	Robot.drive.driveTank(rightMovement,leftMovement);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
