package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {

    By searchCustomer = By.xpath("//input[@placeholder='Search Customer']");

    By deleteBtn = By.xpath("//tr[@class='ng-scope']//td//button");


    public void searchCustomerByName(String name) {

        sendTextToElement(searchCustomer, name);

    }


    public void deleteCustomer() {

        clickOnElement(deleteBtn);

    }

    public void clickOnYourName() {
    }

    public void clickOnSelectName() {
    }

    public void clickOnLoginButton() {
    }

    public String getYourNameMessage() {

        return null;
    }
}
