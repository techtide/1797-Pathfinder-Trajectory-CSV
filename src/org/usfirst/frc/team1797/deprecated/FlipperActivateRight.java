package org.usfirst.frc.team1797.deprecated;
//package org.usfirst.frc.team1797.robot.commands;
//
//import org.usfirst.frc.team1797.robot.Robot;
//import org.usfirst.frc.team1797.robot.RobotMap;
//
//import edu.wpi.first.wpilibj.command.Command;
//
///**
// *
// */
//public class FlipperActivateRight extends Command {
//
//    public FlipperActivateRight() {
//        // Use requires() here to declare subsystem dependencies
//       requires(Robot.FLIPPER);
//    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    		Robot.FLIPPER.extendRight();
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() { // read FlipperActivateLeft.java doc
//    		if(System.currentTimeMillis() - Robot.FLIPPER.getLastActuationRight() >= RobotMap.FLIPPER_PISTON_TIME && Robot.FLIPPER.isRightExtended()) {
//    			Robot.FLIPPER.stopLeft();
//    			Robot.FLIPPER.retractRight();
//    		}
//    }
//
//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() { // read FlipperActivateLeft.java doc
//    		return (System.currentTimeMillis() - Robot.FLIPPER.getLastActuationRight() >= RobotMap.FLIPPER_PISTON_TIME) && !Robot.FLIPPER.isRightExtended();
//    }
//
//    // Called once after isFinished returns true
//    protected void end() {
//    		Robot.FLIPPER.stopRight();
//    }
//
//    // Called when another command which requires one or more of the same
//    // subsystems is scheduled to run
//    protected void interrupted() {
//    	Robot.FLIPPER.retractRight();
//    	/*boolean notStopped = true;
//		while(notStopped) {
//			if(System.currentTimeMillis() - Robot.FLIPPER.getLastActuationRight() >= 1000 && Robot.FLIPPER.isRightExtended()) {
//    			Robot.FLIPPER.stopRight();
//    			notStopped = false;
//			}
//		}*/
//    }
//}
