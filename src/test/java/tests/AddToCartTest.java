package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import pages.ProductPage;

public class AddToCartTest extends baseTest {

    @Test
    public void addProductToCart() throws InterruptedException {

        ProductPage product = new ProductPage(driver);

        product.selectBooksSection();
        Thread.sleep(3000);
        product.addComputingBookToCart();
System.out.println(product.getSuccessMessage());
        Assert.assertTrue(product.getSuccessMessage()
                .contains("The product has been added to your shopping cart"));
    }
}