package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class hotelMyCampPage {
    public hotelMyCampPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[. = 'Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id = 'UserName']")
    public WebElement username;

    @FindBy(xpath = "//input[@id = 'Password']")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement submitButton;

    @FindBy (xpath="//span[@class='username username-hide-on-mobile']")
    public WebElement managerAfterLogin;
}
