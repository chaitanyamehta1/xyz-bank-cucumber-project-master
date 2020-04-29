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
public class CustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());

    @FindBy(id = "userSelect")
    WebElement _yourNameLink;
    @FindBy(xpath = "//option[contains(text(),'Hermoine Granger')]")
    WebElement _selectNameFromList;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _loginButton;
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement _getYourNameText;

    public void clickOnYourName() {
        Reporter.addStepLog("Clicking on your name " + _yourNameLink.toString());
        clickOnElement(_yourNameLink);
        log.info("Clicking on your name " + _yourNameLink.toString());
    }

    public void clickOnSelectName() {
        Reporter.addStepLog("Clicking on select name " + _selectNameFromList.toString());
        clickOnElement(_selectNameFromList);
        log.info("Clicking on select name " + _selectNameFromList.toString());
    }

    public void clickOnLoginButton() {
        Reporter.addStepLog("Clicking on login button " + _loginButton.toString());
        clickOnElement(_loginButton);
        log.info("Clicking on login button " + _loginButton.toString());
    }

    public String getYourNameMessage() {
        Reporter.addStepLog("Getting your name message " + _getYourNameText.toString());
        log.info("Getting your name message " + _getYourNameText.toString());
        return getTextFromElement(_getYourNameText);
    }


}
