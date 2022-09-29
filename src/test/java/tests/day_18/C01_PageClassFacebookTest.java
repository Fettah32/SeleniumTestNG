package tests.day_18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01_PageClassFacebookTest {

    @Test
    public void test01() {

        FacebookPage facebookPage = new FacebookPage();

        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin


        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
        Faker faker = new Faker();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.loginButton.click();


        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.warningLetter.isDisplayed());

        Driver.quitDriver();
    }
}
