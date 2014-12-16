package robotshapesproject.controller;

import lejos.nxt.Button;
import lejos.nxt.Motor;
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
		while(Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			myRobot.circle();
			myRobot.square();
			myRobot.makeShape(3);
			myRobot.makeShape(6);
			myRobot.makeShape(8);
			Motor.C.stop();
			Motor.B.stop();
		}
	}

}
//C is left
//B is right
