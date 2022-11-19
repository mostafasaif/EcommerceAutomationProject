package org.example.stepDefin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;

public class FollowUsStepDef {

    P03_HomePage homeFollow=new P03_HomePage();

    @When("user opens facebook link")
    public  void openFacebookLink()
    {
        homeFollow.facebook().click();
    }
    @Then("facebook is Opened in a new tab")
    public void facebookIsOpenedInANewTab()

    {
        homeFollow.assertFacebook();

    }

    @When("user opens Twitter link")
    public void userOpensTwitterLink() {
        homeFollow.twitter().click();
    }

    @Then("Twitter is Opened in a new tab")
    public void twitterIsOpenedInANewTab() {
        homeFollow.assertTwitter();

    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        homeFollow.rss().click();
    }

    @Then("rss is Opened in a new tab")
    public void rssIsOpenedInANewTab() {
        homeFollow.assertRss();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        homeFollow.youtube().click();

    }

    @Then("youtube is Opened in a new tab")
    public void youtubeIsOpenedInANewTab() {
        homeFollow.assertYoutube();
    }

}
