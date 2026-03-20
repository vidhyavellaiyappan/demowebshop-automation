package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import pages.RegisterPage;

public class RegistrationFailTest extends baseTest{

	@Test
	public void registerFailTest() {
		
		RegisterPage register=new RegisterPage(driver);
		register.clickRegister();
		register.selectFemaleGender();
		register.enterFirstName("Vidhya");
		register.enterLastName("Vidhu");
		register.enterEmail("vidhuv.19@gmail.com");
		register.enterPassword("Vidhu@1997");
		register.enterRePassword("Vidhu@1997");
		register.clickRegisterbtn();
		String errorMessage = register.getEmailErrorMessage();
		System.out.println(errorMessage);
		Assert.assertTrue(errorMessage.contains("The specified email already exists"));
	}
}
