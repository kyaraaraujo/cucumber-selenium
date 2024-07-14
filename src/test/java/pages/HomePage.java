package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import support.page.BasePage;

public class HomePage extends BasePage {

    @FindBy(css = "input[type=checkbox]")
    private WebElement hamburgerMenu;

    @FindBy(linkText = "Sign In Portal")
    private  WebElement signInLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public  void clickOnHamburgerMenu() {
        hamburgerMenu.click();
    }

    public  void clickOnSignIn() {
        signInLink.click();
    }

    public  void goToLoginPage(){
        clickOnHamburgerMenu();
        clickOnSignIn();
    }

}
