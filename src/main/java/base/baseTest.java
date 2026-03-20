package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
protected static WebDriver driver;
@BeforeMethod
public void setUp() {
	
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
}
@AfterMethod
public void tearDown() {
	driver.manage().deleteAllCookies();
	driver.quit();
}
}
