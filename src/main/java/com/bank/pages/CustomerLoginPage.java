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
public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement _getLogoutButton;
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement _clickLogoutButton;


    public String getLogoutFeature() {
        Reporter.addStepLog("Getting logout text " + _getLogoutButton.toString());
        log.info("Getting logout text " + _getLogoutButton.toString());
        return getTextFromElement(_getLogoutButton);
    }

    public void clickLogoutFeature() {
        Reporter.addStepLog("Clicking on logout button " + _clickLogoutButton.toString());
        log.info("Clicking on logout button " + _clickLogoutButton.toString());
        clickOnElement(_clickLogoutButton);
    }


}
