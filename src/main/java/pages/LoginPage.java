package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(By.linkText("Log in")).click();
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    public void clickLoginBtn() {
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }

    public String getLoggedInUser() {
        return driver.findElement(By.className("account")).getText();
    }
}