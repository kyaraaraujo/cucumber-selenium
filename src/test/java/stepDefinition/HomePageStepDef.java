package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoggedUserPage;
import pages.LoginPage;
import support.utils.DriverUtil;

public class HomePageStepDef {

    public WebDriver driver;
    public HomePage homePage;
    public LoginPage loginPage;
    public LoggedUserPage loggedUserPage;

    @Before
    public void setUp(){
        driver = new DriverUtil().setupChromeDriverWithWaiting();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        loggedUserPage = new LoggedUserPage(driver);
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @When("User navigates to the Sign page")
    public void user_navigates_to_the_login_page() {
        homePage.goToLoginPage();
    }

    @Then("User can see credencials form")
    public void user_successfully_enters_the_log_in_details() {
        Assert.assertTrue(loginPage.isUsernameLabelTextVisible());
    }

    @When("User insert credencials")
    public void user_insert_credencials() {
        loginPage.insertRightCredencials();
    }

    @And("click on login")
    public void click_on_login() {
        loginPage.submitLogin();
    }

    @Then("User will see {int} shoes categories")
    public void user_will_see_shoes_categories(int size) {
        Assert.assertEquals(size, loggedUserPage.countShoeTypeCategories());
    }
}
