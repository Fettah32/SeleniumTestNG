package tests.day_18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.hotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test
    public void positiveLoginTest() {
        hotelMyCampPage hmcPage = new hotelMyCampPage();

        // Bir test method olustur positiveLoginTest()
        // https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));

        hmcPage.loginButton.click();

        // test data username: manager ,  test data password : Manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcUserName"));

        hmcPage.password.sendKeys(ConfigReader.getProperty("hmcPassword"));

        hmcPage.submitButton.click();


        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.managerAfterLogin.isDisplayed());

        Driver.quitDriver();

    }
}
