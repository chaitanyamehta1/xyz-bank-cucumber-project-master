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
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginLink;
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLogin;

    public void clickOnBankManagerLoginButton() {
        Reporter.addStepLog("Clicking on bank manager login button " + _bankManagerLoginLink.toString());
        clickOnElement(_bankManagerLoginLink);
        log.info("Clicking on bank manager login button " + _bankManagerLoginLink.toString());
    }

    public void clickOnCustomerLoginButton() {
        Reporter.addStepLog("Clicking on customer login button " + _customerLogin.toString());
        clickOnElement(_customerLogin);
        log.info("Clicking on customer login button " + _customerLogin.toString());
    }


}
