package org.example.stepDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;

public class SearchStepDef {

    P03_HomePage homepage=new P03_HomePage();
    String[] Values= {"book","laptop","nike"};
    @When("user click on search field")
    public void userclickonsearchfield()
    {
        homepage.searchInput().click();
    }

    @And("user search with {string}")
    public void userSearchWith(String product) {
        homepage.searchInput().sendKeys(product);
        homepage.searchingButton().click();
    }

    @Then("user could find {string}")
    public void userCouldFind(String product) {
        for (int x = 0; x < homepage.prodacts().size(); x++) {
            String Text = homepage.prodacts().get(x).getText();
            Assert.assertTrue(Text.toLowerCase().contains(product));

        }
    }

    @Then("user could find {string} inside product details")
    public void userCouldFindInsideProductDetailsPage(String SKU) {
        homepage.ProductDetails().click();
        Assert.assertTrue(homepage.ProductSku().getText().contains(SKU));
    }


}
