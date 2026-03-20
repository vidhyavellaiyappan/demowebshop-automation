package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Open Books section
    public void selectBooksSection() {
        driver.findElement(By.linkText("Books")).click();
    }

    // Click Add to Cart for "Computing and Internet"
    public void addComputingBookToCart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Computing and Internet']/ancestor::div[@class='product-item']//input[@value='Add to cart']")
        )).click();
    }

    // Capture success message
    public String getSuccessMessage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("bar-notification"))).getText();
    }
    public void clickShoppingCart() {
        driver.findElement(By.linkText("Shopping cart")).click();
    }

    public void clickCheckout() {
        driver.findElement(By.id("checkout")).click();
    }
}