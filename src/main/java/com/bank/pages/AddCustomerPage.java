package com.bank.pages;

import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Chaitanya
 */
public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement _firstNameLink;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement _lastNameLink;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement _postCodeLink;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _addCustomerButton;

    public void enterFirstName(String firstName) {
        Reporter.addStepLog("Enter first name " +firstName+" First name field"+ _firstNameLink.toString());
        sendTextToElement(_firstNameLink, firstName);
        log.info("Enter first name " +firstName+ " First name field"+ _firstNameLink.toString());
    }

    public void enterLastName(String lastName) {
        Reporter.addStepLog("Enter last name " +lastName+ "Last name field"+ _lastNameLink.toString());
        sendTextToElement(_lastNameLink, lastName);
        log.info("Enter last name " + lastName+ "Last name field "+_lastNameLink.toString());
    }

    public void enterPostCode(String postcode) {
        Reporter.addStepLog("Enter post code " +postcode+ "Post code field"+ _postCodeLink.toString());
        sendTextToElement(_postCodeLink, postcode);
        log.info("Enter post code " +postcode+ "Post code field"+ _postCodeLink.toString());
    }

    public void clickOnAddCustomerButton() {
        Reporter.addStepLog("Clicking on add customer button " + _addCustomerButton.toString());
        log.info("Clicking on add customer button " + _addCustomerButton.toString());
        clickOnElement(_addCustomerButton);

    }


}
