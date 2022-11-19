package org.example.pages;

import org.example.stepDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.example.stepDefin.Hooks.driver;

public class P03_HomePage {

    int randomNumber= new Random().nextInt(3);
    int subCategoryNum= new Random().nextInt(3);
    Actions hover = new Actions(Hooks.driver);

    public WebElement searchInput(){

        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchingButton() {

        return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button"));
    }
    public List<WebElement> prodacts()
    {
        List<WebElement> prodacts= Hooks.driver.findElements(By.cssSelector("span[class =\"product-title\"]"));
        return prodacts;
    }
    public WebElement ProductDetails() {

        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a"));
    }
    public WebElement ProductSku() {

        return driver.findElement(By.className("sku"));
    }

    public List<WebElement> categories()
    {
        List<WebElement> categories= Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return categories;
    }
    public void randomHover(List<WebElement> categories)
    {
        hover.moveToElement(categories.get(randomNumber)).perform();
    }
    public List <WebElement> sub_catigory()
    {
        randomNumber++;
        List <WebElement> sub_catigory= Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+randomNumber+"]/ul[@class=\"sublist first-level\"]/li"));

        return sub_catigory;
    }
    public String clickOnSubCatigoures(List<WebElement> SubCatigoures)
    {
        String sub_CategorieName=SubCatigoures.get(subCategoryNum).getText();
        SubCatigoures.get(subCategoryNum).click();
        return sub_CategorieName;
    }
    public WebElement subCatigoryTitle() {

        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));
    }
    public String getSubCatigoryTitle(WebElement webElement)
    {
        return webElement.getText();
    }



    public WebElement clickOfSlider(int sliderNum){

        return driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }
    public WebElement firstSlider()
    {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
    }
    public WebElement secondSlider()
    {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
    }


    //***************Follow Us
    public WebElement facebook()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
    }
    public void assertFacebook()
    {
        ArrayList<String> tab=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tab.get(1));
        String actual=Hooks.driver.getCurrentUrl();
        String expexted= "https://www.facebook.com/nopCommerce";
        Assert.assertEquals(actual,expexted,"this is our facebook page");
    }
    public WebElement twitter()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
    }
    public void assertTwitter()
    {
        ArrayList<String> tab=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tab.get(1));
        String actual=Hooks.driver.getCurrentUrl();
        String expected= "https://twitter.com/nopCommerce";
        Assert.assertEquals(actual,expected,"this is our Twitter page");
    }
    public WebElement rss()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
    }
    public void assertRss()
    {
        ArrayList<String> tab=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tab.get(1));
        String actual=Hooks.driver.getCurrentUrl();
        String expected= "https://demo.nopcommerce.com/new-online-store-is-open";
        Assert.assertEquals(actual,expected,"this is our rss page");
    }

    public WebElement youtube()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
    }
    public void assertYoutube()
    {
        ArrayList<String> tab=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tab.get(1));
        String actual=Hooks.driver.getCurrentUrl();
        String expected= "https://www.youtube.com/user/nopCommerce";
        Assert.assertEquals(actual,expected,"this is our Youtube page");
    }



    public List<WebElement> wishlist(){

        return  Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));

    }

    public WebElement successMeasege()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }
    public WebElement WishlistButton()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]"));
    }
    public WebElement Qtyfield()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
    }

    //***************9
    public WebElement ProductCurrency() {
        return driver.findElement(By.name("customerCurrency"));
    }
    public WebElement Euro() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]/div/select/option[2]"));
    }
    public WebElement Price() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span"));

    }
    public List<WebElement> Elements()
    {
        List<WebElement> elements= driver.findElements(By.cssSelector("span[class =\"price actual-price\"]"));
        return elements;
    }

}
