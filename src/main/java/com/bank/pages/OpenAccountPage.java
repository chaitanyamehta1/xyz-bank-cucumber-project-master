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
public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement _openAccountLink;
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _customerLink;
    @FindBy(xpath = "//option[contains(text(),'Hermoine Granger')]")
    WebElement _selectCustomerName;
    @FindBy(id = "currency")
    WebElement _currencyLink;
    @FindBy(xpath = "//option[contains(text(),'Pound')]")
    WebElement _currencyPound;
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _clickOnProcess;

    public void clickOnOpenAccountButton() {
        Reporter.addStepLog("Clicking on open account button " + _openAccountLink.toString());
        clickOnElement(_openAccountLink);
        log.info("Clicking on open account button " + _openAccountLink.toString());
    }

    public void clickOnCustomerName() {
        Reporter.addStepLog("Clicking on customer name " + _customerLink.toString());
        clickOnElement(_customerLink);
        log.info("Clicking on customer name " + _customerLink.toString());
    }

    public void selectCustomerFirstName() {
        Reporter.addStepLog("Selecting customer name " + _selectCustomerName.toString());
        clickOnElement(_selectCustomerName);
        log.info("Selecting customer name " + _selectCustomerName.toString());
    }

    public void clickOnCurrencyButton() {
        Reporter.addStepLog("Clicking on currency button " + _customerLink.toString());
        clickOnElement(_currencyLink);
        log.info("Clicking on currency button " + _customerLink.toString());
    }

    public void selectCurrencyPound() {
        Reporter.addStepLog("Selecting currency as pound " + _currencyPound.toString());
        clickOnElement(_currencyPound);
        log.info("Selecting currency as pound " + _currencyPound.toString());
    }

    public void clickOnProcessButton() {
        Reporter.addStepLog("Clicking on process button " + _clickOnProcess.toString());
        log.info("Clicking on process button " + _clickOnProcess.toString());
        clickOnElement(_clickOnProcess);

    }


}
