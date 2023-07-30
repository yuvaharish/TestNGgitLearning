package executionPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {
	
	
	@Test
	public void listnerTestExample() {
		System.out.println("this is the Test case");
		Assert.assertTrue(false);
	}
	
	
	/*
	 * @Test(retryAnalyzer = Retry.class) public void listnerTestExample2() {
	 * System.out.println("this is the Test case2"); Assert.assertTrue(false); }
	 */
	
	
	@Test(invocationCount = 10)
	public void listnerTestExample2() {
		  System.out.println("this is the Test case2"); 
		  Assert.assertTrue(false); }

}
