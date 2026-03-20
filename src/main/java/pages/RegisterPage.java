package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	}
	public void clickRegister() {
		
		driver.findElement(By.linkText("Register")).click();
	}
	public void selectMaleGender() {
	    driver.findElement(By.id("gender-male")).click();
	}

	public void selectFemaleGender() {
	    driver.findElement(By.id("gender-female")).click();
	}
	public void enterFirstName(String fname) {
		
		driver.findElement(By.id("FirstName")).sendKeys(fname);
	}
public void enterLastName(String lname) {
		
		driver.findElement(By.id("LastName")).sendKeys(lname);
	}
public void enterEmail(String email) {
	
	driver.findElement(By.id("Email")).sendKeys(email);
}
public void enterPassword(String pass) {
	
	driver.findElement(By.id("Password")).sendKeys(pass);
}
public void enterRePassword(String pass) {
	driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
}
public void clickRegisterbtn() {
	driver.findElement(By.id("register-button")).click();
}
public String getEmailErrorMessage() {

    return driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
}
}
