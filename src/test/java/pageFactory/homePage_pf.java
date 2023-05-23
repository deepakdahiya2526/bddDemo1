package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage_pf {
    @FindBy(id = "logout")
    WebElement txt_logout;

    WebDriver driver;

    public homePage_pf(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public boolean checkLogoutIsDisplayed(){
      return txt_logout.isDisplayed();
    }
}
