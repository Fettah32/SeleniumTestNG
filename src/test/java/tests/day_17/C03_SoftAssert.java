package tests.day_17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_SoftAssert extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test01() {

        SoftAssert softAssert = new SoftAssert();
        /*
        SoftAssert baslangic ve bitis satirlari arasindaki tum assertion'lari yapip
        bitis olarak belirtmemiz gereken assertAll() methoduyla test methodumuzdaki
        butun assertion'lari kontrol eder. Failed olan olursa assertion yaptigimiz
        methodun sonuna yazdigimiz mesaji bize konsolda verir.
         */

        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        driver.navigate().refresh();

        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"), "Girdiginiz stringi icermiyor.");

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled());

        //4-arama kutusuna Nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed());
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Nutella"));
        softAssert.assertAll();
    }
}
