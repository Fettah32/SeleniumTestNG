package tests.day_19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.hotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_NegativeTest {

    @Test
    public void negativeTest() {

        hotelMyCampPage hmcPage = new hotelMyCampPage();

        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        hmcPage.loginButton.click();

        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongUserName"));

        hmcPage.password.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));

        hmcPage.submitButton.click();

        Assert.assertTrue(hmcPage.submitButton.isDisplayed());

        Driver.quitDriver();
    }
}
