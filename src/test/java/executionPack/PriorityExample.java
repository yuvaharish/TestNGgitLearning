package executionPack;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("Start The Car");
	}
	
	//how to ignore the test
	@Test(priority = 4,enabled = false)
	public void turnedOnMusic() {
		System.out.println("turnedOnMusic");
	}
	
	@Test(priority = 1)
	public void firstGear() {
		System.out.println("FirstGear");
	}
	
	@Test(priority = 2)
	public void secondGear() {
		System.out.println("SecondGear");
	}
	
	@Test(priority = 3)
	public void thirdGear() {
		System.out.println("ThirdGear");
	}
	
	
}
