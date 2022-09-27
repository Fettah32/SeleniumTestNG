package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase_BeforeMethod_AfterMethod {
    // abstract yapmamizin sebebi, bu class'dan obje uretilmesinin onune gecmektir.

    protected WebDriver driver;
    protected Actions actions;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions= new Actions(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
