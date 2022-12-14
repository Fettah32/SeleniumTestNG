package tests.day_17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class C01_DependsOnMethods extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
    }

    @Test (dependsOnMethods = "test01")
    public void test02() {
        driver.get("https://www.facebook.com");
    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void test04() {
        driver.get("https://www.youtube.com");
    }
}
