package org.example.stepDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class RegisterStepDef {

    P01_Register register=new P01_Register();

    @Given("user go to register page")
    public void register_page()
    {
        register.registerLink().click();
    }
    @When("user enter gender type")
    public void userChooseGender () {
        register.Gender().click();
    }
    @And("user enter first name \"mostafa\" and last name \"mohamed\"")
    public void enterName() {
        register.firstName().sendKeys("mostafa");
        register.LastName().sendKeys("mohamed");

    }
    @And("user enter date of birth")
    public void enterBirthDate () {
        Select select = new Select(register.BirthDay());
        select.selectByIndex(30);

        select = new Select(register.Month());
        select.selectByVisibleText("August");

        select = new Select(register.Year());
        select.selectByValue("1997");
    }
    @And ("user enter email and companyName")
    public void enterEmailandCompany() {
        register.Email().sendKeys("mustafa.mohamed@gmail.com");
        register.company().sendKeys("itida");
    }

    @And("user fills Password fields \"M0stafa\" \"M0stafa\"")
    public void enterPassword () {
        register.Password().sendKeys("M0stafa");
        register.ConfirmationOfPassword().sendKeys("M0stafa");
    }
    @And("user clicks on register button")
    public void registerButton() {
        register.registerButton().click();
    }
    @Then("success message is displayed")
    public void successMessage() {
        // 1st Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.sucssesMasege().isDisplayed(), "Success Message");
        // 2nd Assertion
        String actual = register.sucssesMasege().getCssValue("color");
        soft.assertEquals(actual,"rgba(76, 177, 124, 1)" , "color");
        // Assert All
        soft.assertAll();

    }

}
