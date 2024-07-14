package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import support.page.BasePage;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//label[text()=\"Username:\"]")
    private WebElement usernameLabel;

    @FindBy(id = "usr")
    private WebElement userField;

    @FindBy(id = "pwd")
    private WebElement passwordField;


    @FindBy(xpath = "//input[@class=\"btn btn-info\"]")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public boolean isUsernameLabelTextVisible(){
        return usernameLabel.isDisplayed();
    }

    public void insertRightCredencials(){
        userField.sendKeys("abc");
        passwordField.sendKeys("pwd");
    }

    public void submitLogin(){
        loginButton.click();
    }
}
