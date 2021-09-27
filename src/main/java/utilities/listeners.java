package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {

	public void onTestFailure(ITestResult arg0) {
		try {
			Screenshot.fun();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
