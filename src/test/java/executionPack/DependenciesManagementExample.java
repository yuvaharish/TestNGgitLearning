package executionPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesManagementExample {
	
	@Test(enabled = true)
	public void highSchool() {
		String url="10 th pass";
		Assert.assertEquals(url, "10 th pass");
		System.out.println("10 pass high school");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void highSecondarySchool() {
		System.out.println("12 pass high school");
	}
	
	@Test(dependsOnMethods = "highSecondarySchool")
	public void arstsandScienceCollege() {
		System.out.println("BSC course joined");
	}

}
