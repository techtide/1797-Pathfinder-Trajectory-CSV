package org.usfirst.frc.team1797.robot.utils;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

import org.usfirst.frc.team1797.robot.commands.auto.AutoRunner.Routine;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;

public class TrajectoryUtils {
	private HashMap<String, Trajectory> fileTrajectoryMap;
	private String path = "/home/lvuser/";
	
	public TrajectoryUtils() {
		fileTrajectoryMap = new HashMap<>();
		initialiseFileTrajectoryMap();
	}
	
	public void initialiseFileTrajectoryMap() {
		// Instantiates and reads all files into a map based on the format of "File/routine name":Trajectory.
		File folderPath = new File(path + "trajectories/");
		File[] folder = folderPath.listFiles();
		for(File file : folder) {
			fileTrajectoryMap.put(file.getName(), Pathfinder.readFromCSV(file));
		}
		System.out.println("[TrajectoryManager: initFileTrajectoryMap] The files in the trajectory hashmap are: " 
							+ fileTrajectoryMap);
	}
	
	public Trajectory csvToTrajectory(Routine routineToRun, char direction) {
//		File f = new File(path + "trajectories/" + routineToRun.name() + direction + ".csv");
//		System.out.println("[TrajectoryManager: csvToTrajectory] The file's name is: " + f.getName());
//		return Pathfinder.readFromCSV(f);
		System.out.println("CSV FILE NAME: "+ routineToRun.name().toUpperCase() + direction + ".csv");
		return fileTrajectoryMap.get(routineToRun.name().toUpperCase() + direction + ".csv");
	}
}