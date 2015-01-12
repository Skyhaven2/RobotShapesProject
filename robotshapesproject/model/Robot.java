package robotshapesproject.model;

import robotshapesproject.controller.RobotController;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

public class Robot
{
	private RobotController basecontroller;
	public UltrasonicSensor mySonar;
	public TouchSensor myTouchSensor;
	public LightSensor myLightSensor;
	public SoundSensor mySoundSensor;

	public Robot(RobotController basecontroller)
	{
		this.basecontroller = basecontroller;
		
		myTouchSensor = new TouchSensor(SensorPort.S1);
		mySoundSensor = new SoundSensor(SensorPort.S2);
		myLightSensor = new LightSensor(SensorPort.S3);
		mySonar = new UltrasonicSensor(SensorPort.S4);
	}

	public void driveAroundClassroomViaSonar()
	{
		if(mySonar.getDistance() < 30)
		{
			Motor.B.backward();
			Motor.C.backward();
			Delay.msDelay(500);
			rotateByAngleRight(90);
		}
		else
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(500);
		}
	}
	
	public void driveAroundClassroomViaTouch()
	{
		if(myTouchSensor.isPressed())
		{
			Motor.B.backward();
			Motor.C.backward();
			Delay.msDelay(1000);
			rotateByAngleRight(90);
		}
		else
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(500);
		}
	}
	
	public void robotDance()
	{
		int numberOfTimes = 0;
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		Motor.B.backward();
		Motor.C.backward();
		Delay.msDelay(500);
		circle();
		while(numberOfTimes < 10)
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(100);
			Motor.B.backward();
			Motor.C.backward();
			Delay.msDelay(100);
			numberOfTimes++;
		}
	}
	
	public void classShapes()
	{
		circle();
		square();
		makeShape(3);
		makeShape(6);
		makeShape(8);
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
		Delay.msDelay(2000);
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
		writeR();
		writeO();
		writeN();
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
	private void writeR()
	{
		rotateByAngleLeft(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
		rotateByAngleRight(135);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleRight(45);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleLeft(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleLeft(45);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
	}
	private void writeO()
	{
		rotateByAngleLeft(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
		rotateByAngleRight(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		rotateByAngleRight(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
		rotateByAngleLeft(90);
		Motor.B.backward();
		Motor.C.backward();
		Delay.msDelay(1000);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
	}
	private void writeN()
	{
		rotateByAngleLeft(90);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
		rotateByAngleRight(135);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2828);
		rotateByAngleLeft(135);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
	}
}
