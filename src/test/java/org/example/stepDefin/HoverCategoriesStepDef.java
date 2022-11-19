package org.example.stepDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HoverCategoriesStepDef {

    P03_HomePage homePage =new P03_HomePage();
    String subCategorieName;
    List<WebElement> categories;
    List <WebElement> subCategories;
    @When("user hover on random category")
    public void randomHover()
    {
        categories=homePage.categories();
        homePage.randomHover(categories);

    }

    @And("user click on random subcategory")
    public void userClickOnRandomSubCategory() {
        subCategories=homePage.sub_catigory();
        subCategorieName=homePage.clickOnSubCatigoures(subCategories);

    }

    @Then("validate sub category page title")
    public void validateSubCategoryPageTitle() {

        System.out.println(subCategorieName);
        System.out.println(homePage.subCatigoryTitle());

        Assert.assertEquals(homePage.getSubCatigoryTitle(homePage.subCatigoryTitle()),subCategorieName);
    }

}
