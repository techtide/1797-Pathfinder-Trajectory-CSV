package org.usfirst.frc.team1797.robot;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.usfirst.frc.team1797.robot.commands.auto.AutoCrossBaseline13;
import org.usfirst.frc.team1797.robot.commands.auto.AutoDoNothing;
import org.usfirst.frc.team1797.robot.commands.auto.AutoRunner;
import org.usfirst.frc.team1797.robot.commands.auto.AutoRunner.Routine;
import org.usfirst.frc.team1797.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	//public static final DriveTrain DRIVE_TRAIN = new DriveTrain();
	public static final Drivetrain DRIVE_TRAIN = new Drivetrain();
	//public static final IntakeMotors intakeMotors = new IntakeMotors();
	//public static final IntakePistons intakePistons = new IntakePistons();
	// public static final Roller ROLLER = new Roller();
	//public static final RollerPiston ROLLER_PISTON = new RollerPiston();
	// public static final Flipper FLIPPER = new Flipper();
	// public static final Ramp RAMP = new Ramp();
	public static OI oi;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();
	
	SendableChooser autonomousChooser;
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		autonomousChooser = new SendableChooser();
		autonomousChooser.addDefault("Deposit Box 1", new AutoRunner(Routine.DEPOSITBOX1));
	}
	
	@Override
	public void disabledInit() {
		
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
		autonomousCommand = (Command) autonomousChooser.getSelected();
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}