package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static String captureScreenshot(WebDriver driver,String testName ) {
		// String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	String Path=	System.getProperty("user.dir")+"/screenshots/"+testName+System.currentTimeMillis()+".png";
try {
	FileUtils.copyFile(source, new File(Path));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return Path;
	}
}
