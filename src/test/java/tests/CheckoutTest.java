package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutTest extends baseTest {

    @Test
    public void checkoutFlowTest() {

        LoginPage login = new LoginPage(driver);
        ProductPage product = new ProductPage(driver);

        // Step 1: Login
        login.clickLogin();
        login.enterEmail("vidhuv.19@gmail.com");
        login.enterPassword("Vidhu@1997");
        login.clickLoginBtn();

        // Step 2: Add product
        product.selectBooksSection();
        product.addComputingBookToCart();

        // Step 3: Go to cart
        product.clickShoppingCart();
        driver.findElement(By.id("termsofservice")).click();
        // Step 4: Checkout
        product.clickCheckout();

        // Step 5: Verify checkout page
        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains("checkout"), "Checkout page not opened!");
    }
}