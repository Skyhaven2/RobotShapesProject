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
	
	private void rotateByAngleLeft(int angle)
	{
		double delayPerDegree = (90.0 / 500.0);
		int delayPerAngle = (int) (Math.round(angle / delayPerDegree));
			Motor.B.forward();
			Motor.C.backward();
			Delay.msDelay(delayPerAngle);
	}
	
	private void rotateByAngleRight(int angle)
	{
		double delayPerDegree = (90.0 / 500.0);
		int delayPerAngle = (int) (Math.round(angle / delayPerDegree));
			Motor.C.forward();
			Motor.B.backward();
			Delay.msDelay(delayPerAngle);
	}
	
	public void writeCamron()
	{
		writeC();
		writeA();
		writeM();
	}
	private void writeC()
	{
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleLeft(45);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleLeft(45);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleLeft(45);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
	}
	private void writeA()
	{
		rotateByAngleLeft(45);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
		rotateByAngleRight(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleRight(135);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleRight(180);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleRight(45);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleLeft(45);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
	}
	private void writeM()
	{
		rotateByAngleLeft(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
		rotateByAngleRight(135);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2828);
		rotateByAngleLeft(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2828);
		rotateByAngleRight(135);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
		rotateByAngleLeft(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
	}
}
