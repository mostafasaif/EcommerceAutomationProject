package org.example.stepDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefin.Hooks.driver;

public class LoginStepDef {
    P02_Login login=new P02_Login();
    @Given("user navigate to login page")
    public void navigate_To_Login()
    {
        login.NavigateToLoginPage().click();

    }
    @When("login with valid \"(.*)\" and \"(.*)\"$")
    public void vaild_data(String email, String password) throws InterruptedException {
        login.Login(email, password);
        Thread.sleep(4000);
    }


    public void validData(String email, String password) throws InterruptedException {
        login.Login(email,password);
        Thread.sleep(5000);
    }

    @Then("user press on login button")
    public void login_Button()

    {
        login.enterPassword().sendKeys(Keys.ENTER);
    }
    @And("user login to the system successfully")

    public void login_Success()

    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/","URL login is correct");
        driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed();
        soft.assertTrue(login.myAccount().isDisplayed(), "My Account login successfly ");
        soft.assertAll();

    }
    @When("login with invalid email \"(.*)\" and invalid password \"(.*)\"$")
    public void invaildData(String email, String password) throws InterruptedException {
        login.Login(email,password);
        Thread.sleep(5000);
    }
    @And("user could not login to the system")

    public void loginFailed()

    {SoftAssert soft = new SoftAssert();
        soft = new SoftAssert();
        login.logFailed().isDisplayed();
        String actual = login.logFailed().getText();
        soft.assertEquals(actual,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Wrong Message");
        actual = login.logFailed().getCssValue("color");
        soft.assertEquals(actual, "rgba(228, 67, 75, 1)", "color");
        soft.assertAll();
    }

}
