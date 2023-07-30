package executionPack;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int failedcount=0;
	int limit=3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(failedcount<limit) {
			failedcount++;
			return true;
		}
		return false;
	}

}
