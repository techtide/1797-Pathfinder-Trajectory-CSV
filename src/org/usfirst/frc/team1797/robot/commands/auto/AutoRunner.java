package org.usfirst.frc.team1797.robot.commands.auto;

import org.usfirst.frc.team1797.robot.Robot;
import org.usfirst.frc.team1797.robot.utils.PathfinderUtils;
import org.usfirst.frc.team1797.robot.utils.TrajectoryUtils;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoRunner extends Command {
	public enum Routine {
		DEPOSITBOX1, DEPOSITBOX2, DEPOSITBOX3
	}
	
	private Routine routineToRun;
	private PathfinderUtils pathfinderUtility;
	private TrajectoryUtils csvTrajectoryUtility;
	
	public AutoRunner(Routine routineToRun) {
        requires(Robot.DRIVE_TRAIN);
    }

    protected void initialize() {
        this.routineToRun = routineToRun;
        csvTrajectoryUtility = new TrajectoryUtils();
    		pathfinderUtility = new  PathfinderUtils (csvTrajectoryUtility.csvToTrajectory(routineToRun, DriverStation.getInstance().getGameSpecificMessage().charAt(0)), 
    												Robot.DRIVE_TRAIN.leftEncoder, 
    												Robot.DRIVE_TRAIN.rightEncoder);
    }

    protected void execute() {
    
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    
    }
    
    protected void interrupted() {
    
    }
}
