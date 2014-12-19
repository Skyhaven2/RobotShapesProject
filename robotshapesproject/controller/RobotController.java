package robotshapesproject.controller;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;
import lejos.nxt.SoundSensor;
import lejos.util.Delay;
import robotshapesproject.model.Robot;

public class RobotController
{

	private Robot myRobot;

	public RobotController()
	{
		myRobot = new Robot(this);
	}

	public void start()
	{	
		while(! Button.ESCAPE.isDown())
		{
			myRobot.driveAroundClassroomViaTouch();
		}
	}
	
	private void checkIfNeedToDance()
	{
		if(myRobot.mySoundSensor.readValue() > 40)
		{
			myRobot.robotDance();
		}
		Motor.C.stop();
		Motor.B.stop();
	}
}
//C is left
//B is right
