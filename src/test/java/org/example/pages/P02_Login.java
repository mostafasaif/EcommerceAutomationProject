package org.example.pages;

import org.example.stepDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefin.Hooks.driver;


public class P02_Login {
    public WebElement NavigateToLoginPage() {
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement enterEmail() {
        return driver.findElement(By.id("Email"));
    }
    public WebElement enterPassword() {
        return driver.findElement(By.id("Password"));
    }

    public void Login(String email ,String password)
    {
        enterEmail().clear();
        enterPassword().clear();

        enterEmail().sendKeys( email );
        enterPassword().sendKeys( password );
    }
    public WebElement myAccount() {
        return driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement logFailed() {
        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }


}
