package tests.practice.practice_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;

import java.util.List;

public class P_01 {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.

    DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).perform();

        //actions.dragAndDrop(dhtmlgoodiesPage.stocholm, dhtmlgoodiesPage.sweden).perform();

        //actions.dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedStates).perform();

        //actions.dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).perform();

        //actions.dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).perform();

        //actions.dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).perform();

        //actions.dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();



        actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway)
                .dragAndDrop(dhtmlgoodiesPage.stocholm, dhtmlgoodiesPage.sweden)
                .dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedStates)
                .dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark)
                .dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea)
                .dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy)
                .dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain)
                .perform();


        Driver.closeDriver();




        /*
        List<WebElement> countriesList = Driver.getDriver().findElements(By.xpath("//div[@class='dragableBoxRight']"));
        System.out.println(countriesList.size());
        for (int i = 1; i <= countriesList.size(); i++) {
            WebElement dropContent = Driver.getDriver().findElement(By.xpath("//div[@id='box" + i + "']"));
            WebElement targetCountries = Driver.getDriver().findElement(By.xpath("//div[@id='box10" + i + "']"));
            actions.dragAndDrop(dropContent, targetCountries).perform();
            Thread.sleep(500);
            }


         */

        /*
        -Frameworkler buyudukce yeni classlar yeni test methodlari yeni webelementler olusturdukca
    icinden cikilmaz, anlasilmaz, tekrar bakimi yapilamaz, guncellemesi cok zor hatta imkansiz bir hal alir.
    -Uzmanlar reusable, maintainable, rahat manipule edilebilir bir framework icin bir design pattern olarak
    POM (page object model)'de karar vermisler.
    -Olmazsa olmazlar
         1) Driver class
         2) Page class
         3) Test class
            Utilities
    -Aradigimiz bir web elementi ya da bir methodu kolaylikla bulabilmek ve guncelleyebilmek icin javadan
    ogrenmis oldugumuz OOP Concept Selenium ile page object modelde birlestirilmis oluyor.
         */
        }
    }



