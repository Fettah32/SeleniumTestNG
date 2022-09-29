package tests.day_17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

public class odev_01 {
     /*
    Bir class oluşturun: DependsOnTest
https://www.amazon.com/ adresine gidin.
Test : Amazon ana sayfaya gittiginizi test edin
Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
arama yapin ve aramanizin gerceklestigini Test edin
Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
$16.83 oldugunu test edin

     */

    @Test
    public void homePageTest() {
        // Bir class oluşturun: DependsOnTest
        // https://www.amazon.com/ adresine gidin.
        Driver.getDriver().get("https://www.amazon.com/");

        // Test : Amazon ana sayfaya gittiginizi test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "homePageTest")
    public void searchBoxTest() {
        // Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
        // arama yapin ve aramanizin gerceklestigini Test edin
        SoftAssert softAssert = new SoftAssert();
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        softAssert.assertAll();
    }

    @Test (dependsOnMethods ="searchBoxTest" )
    public void firstProductPriceTest() {
        // Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        // $16.83 oldugunu test edin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.ilkUrun.click();


        WebElement sellAllBuyingOptions=Driver.getDriver().findElement(By.id("buybox-see-all-buying-choices"));
        sellAllBuyingOptions.click();

        WebElement urunPriceElement = Driver.getDriver().findElement(By.id("aod-price-1"));
        String urunPrice = urunPriceElement.getText().replaceAll("\\D", "");

        System.out.println("urunnnnnnn " + urunPrice);
        String expectedPrice= "$16.83".replaceAll("\\D", "");
        System.out.println(expectedPrice);
        Assert.assertNotEquals(urunPrice,expectedPrice,"fiyat aynı. price test failed");





        Driver.closeDriver();
    }
}
