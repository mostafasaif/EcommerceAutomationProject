package org.example.stepDefin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;

public class CurrancyStepDef {
    @Given("CLick on Currencues Selection")
    public  void open_Currencies(){
        HomePage.ProductCurrency().click();
    }
    P03_HomePage HomePage= new P03_HomePage();
    @When("user can select Euro from currency selection")
    public  void select_Currencies(){
        HomePage.Euro().click();

    }

    @Then("All dollar sign change to Euro sign")
    public void EuroSign() {
        for (int x = 0; x < HomePage.Elements().size(); x++) {
            String Text = HomePage.Elements().get(x).getText();
            Assert.assertTrue(Text.contains("€"));

        }
    }
}
