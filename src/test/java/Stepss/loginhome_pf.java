package Stepss;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.homePage_pf;
import pageFactory.loginPage_pf;

public class loginhome_pf {
    WebDriver driver=null;
    loginPage_pf login;
    homePage_pf home;


    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("inside the browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("browser opened successfully");
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws InterruptedException {
        login = new loginPage_pf(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
        login.clickLogin();
    }

    @Then("user is navigated to home page")
    public void userIsNavigatedToHomePage() throws InterruptedException {
        home= new homePage_pf(driver);
        Assert.assertTrue(home.checkLogoutIsDisplayed());
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
