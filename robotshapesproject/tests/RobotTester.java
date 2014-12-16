package robotshapesproject.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import robotshapesproject.controller.RobotController;
import robotshapesproject.model.Robot;

public class RobotTester
{
	private Robot myRobotTester;
	private RobotController appController;

	@Before
	public void setUp() throws Exception
	{
		appController = new RobotController();
		myRobotTester = new Robot(appController);
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testRobotExists()
	{
		assertNotNull(myRobotTester);
	}
	@Test
	public void testRobot()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSquare()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testCircle()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testOctagon()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testMakeShape()
	{
		fail("Not yet implemented");
	}
}
