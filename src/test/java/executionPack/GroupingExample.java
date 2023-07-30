package executionPack;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups = {"smoke"})
	public void apple1() {
		System.out.println("Apple1");
	}
	@Test(groups = {"smoke"})
	public void apple2() {
		System.out.println("Apple2");
	}
	@Test(groups = {"smoke"})
	public void apple3() {
		System.out.println("Apple3");
	}
	@Test(groups = {"regerssion"})
	public void moto1() {
		System.out.println("moto1");
	}
	@Test(groups = {"regerssion"})
	public void moto2() {
		System.out.println("moto2");
	}
	@Test(groups = {"regerssion"})
	public void moto3() {
		System.out.println("moto3");
	}

}
