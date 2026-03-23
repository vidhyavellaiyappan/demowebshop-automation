package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.baseTest;
import utils.ScreenshotUtil;

public class TestListener extends baseTest implements ITestListener{
	@Override
public void onTestFailure(ITestResult result ) {
String testName = result.getName();	
ScreenshotUtil.captureScreenshot(driver, testName);
System.out.println("Screenshot for failed test:" +testName);
}
}
