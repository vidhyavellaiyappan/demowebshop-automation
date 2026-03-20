package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class DataProviderClass {

    @DataProvider(name = "loginData")
    public String[][] getData() throws IOException {
        return ReadExcel.getLoginData();
    }
}