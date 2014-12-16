package robotshapesproject.model;

import robotshapesproject.controller.RobotController;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class Robot
{
	private RobotController basecontroller;

	public Robot(RobotController basecontroller)
	{
		this.basecontroller = basecontroller;
	}

	public void square()
	{
		int numberOfTimes = 0;
		while (numberOfTimes < 4)
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(1000);
			Motor.B.forward();
			Motor.C.backward();
			Delay.msDelay(500);
			numberOfTimes++;
		}
	}

	public void circle()
	{
		Motor.B.forward();
		Motor.C.stop();
		Delay.msDelay(3000);
	}
	
	/**
	 * This creates a 360 degree shape.
	 * @param numberOfSides the number of sides for the shape
	 */
	public void makeShape(int numberOfSides)
	{
		double angle = (360 / (numberOfSides));
		double delayPerDegree = (90.0 / 500.0);
		int delayPerAngle = (int) (Math.round(angle / delayPerDegree));
		int numberOfTimes = 0;
		while (numberOfTimes < numberOfSides)
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(1000);
			Motor.B.forward();
			Motor.C.backward();
			Delay.msDelay(delayPerAngle);
			numberOfTimes++;
		}
	}
}
