package org.usfirst.frc.team1797.robot;

import java.util.HashMap;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// delay method
	private static final double DELAY_SECONDS = 0;
	public static void delay() {
		long startTime = System.currentTimeMillis();
		while(DELAY_SECONDS*1000+startTime > System.currentTimeMillis()) {}
	}
	
	//Robot controls
	public static final int DRIVER_FORWARD_AXIS = 1;
	public static final int DRIVER_HORIZONTAL_AXIS = 3;
	
	public static final int DRIVER_CONTROLLER_PORT = 0;
	public static final int OPERATOR_CONTROLLER_PORT = 1;
	
	//Physical multiplier of motors
	public static final double DRIVETRAIN_SENSITIVITY = 0.25;
	
	//Time before pistons stop extending/retracting
	public static final double FLIPPER_PISTON_TIME = 1000; // in milliseconds
	
	//Distance between left and right wheels
	public static final double WHEELBASE_WIDTH = 0.63;
	
	//Gyro
	public static final Gyro gyro = new ADXRS450_Gyro();
	
	//Add hardware ports here with an id and port number.
	//Ex. ROBOT_HARDWARE_PORTS.put(<port id>, port number);
	private static HashMap<String, Integer> ROBOT_HARDWARE_PORTS = new HashMap<>();
	static
    {
		//Drivetrain Subsystem
		ROBOT_HARDWARE_PORTS = new HashMap<String, Integer>();
		ROBOT_HARDWARE_PORTS.put("left_motor_1", 0);
		ROBOT_HARDWARE_PORTS.put("left_motor_2", 1);
		ROBOT_HARDWARE_PORTS.put("right_motor_1", 2);
		ROBOT_HARDWARE_PORTS.put("right_motor_2", 3);
		
		// Flipper Subsystem
		ROBOT_HARDWARE_PORTS.put("left_piston_1", 0);
		ROBOT_HARDWARE_PORTS.put("left_piston_2", 1);
		ROBOT_HARDWARE_PORTS.put("right_piston_1", 2);
		ROBOT_HARDWARE_PORTS.put("right_piston_2", 3);
		
		//Encoders
		ROBOT_HARDWARE_PORTS.put("left_encoder_1", 0);
		ROBOT_HARDWARE_PORTS.put("left_encoder_2", 1);
		ROBOT_HARDWARE_PORTS.put("right_encoder_1", 2);
		ROBOT_HARDWARE_PORTS.put("right_encoder_2", 3);
		
    }
	
	public static int getPort(String id) {
		return ROBOT_HARDWARE_PORTS.get(id);
	}
	
}
