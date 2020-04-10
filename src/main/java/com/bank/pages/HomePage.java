package com.bank.pages;


import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By homeButtonLink=By.xpath("//button[@class='btn home']");
    By customerLoginLink = By.xpath("//button[contains(text(),'Customer Login')]");
    By bankManagerLoginLink= By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnHomeBtn(){

        clickOnElement(homeButtonLink);

    }



    public void clickOnCustomerLoginTab(){

        By customerLoginTab = null;
        clickOnElement(customerLoginTab);

    }



    public void clickOnBankManagerLoginTab(){

        By bankManagerLoginTab = null;
        waitUntilElementToBeClickable(bankManagerLoginTab, 10);

        clickOnElement(bankManagerLoginTab);

    }


    public void clickOnBankManagerLoginButton() {
    }

    public void clickOnCustomerLoginButton() {
    }
}