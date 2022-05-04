package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import utility.Utility;

public class HomePage extends Utility {


    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
}
