package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import pages.RegisterPage;

public class RegistrationTest extends baseTest {
	@Test
 public void registrationTest() {
		
		RegisterPage register=new RegisterPage(driver);
			register.clickRegister();
			register.selectMaleGender();
			register.enterFirstName("Sivakumar");
			register.enterLastName("Siva");
			register.enterEmail("sivak"+System.currentTimeMillis()+"@gmail.com");
			register.enterPassword("sivak2107");
			register.enterRePassword("sivak2107");
			register.clickRegisterbtn();
			
			
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		String result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("result"))).getText();
		System.out.println(result);
			Assert.assertEquals(result, "Your registration completed");
		}
	}

