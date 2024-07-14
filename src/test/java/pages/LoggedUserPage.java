package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import support.page.BasePage;

import java.util.List;

public class LoggedUserPage extends BasePage {

    @FindAll(@FindBy(id = "ShoeType"))
    private List<WebElement> shoesTypesCategories;

    public LoggedUserPage(WebDriver driver){ super(driver); }

    public int countShoeTypeCategories(){
        return shoesTypesCategories.size();
    }

}
