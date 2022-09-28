package tests.day_17;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C05_AmazonPageClass {


    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");

        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        String aramaSonucuYazisi = amazonPage.aramaSonucElementi.getText();
        System.out.println(aramaSonucuYazisi);

        Driver.closeDriver();
    }
}
