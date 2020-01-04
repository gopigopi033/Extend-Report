package mainfunctions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryanalyzer implements IRetryAnalyzer{

	int failedcount=0;
	int limit=1;
	
	public boolean retry(ITestResult result) {
		
		if(failedcount<limit) {
			failedcount++;
			return true;
		}
		return false;
	}

}
