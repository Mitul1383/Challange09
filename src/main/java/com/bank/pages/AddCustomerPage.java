package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    By enterLastName = By.xpath("//input[@placeholder='Last Name']");
    By enterPostcode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerBtn = By.xpath("//button[@class='btn btn-default']");

    public void enterFirstName(String str) {
        waitUntilElementToBeClickable(enterFirstName, 5);
        sendTextToElement(enterFirstName, str);
    }

    public void setEnterLastName(String str) {
        waitUntilElementToBeClickable(enterLastName, 5);
        sendTextToElement(enterLastName, str);

    }

    public void setEnterPostcode(String str) {
        waitUntilElementToBeClickable(enterPostcode, 5);
        sendTextToElement(enterPostcode, str);

    }

    public void clickOnAddCustomerButton() {

        clickOnElement(addCustomerBtn);


    }

    public void enterLastName(String granger) {
    }

    public void enterPostCode(String W51RH) {
    }
}