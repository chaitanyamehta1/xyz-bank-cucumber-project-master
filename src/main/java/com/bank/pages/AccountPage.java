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
public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement _depositLink;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _AmountToBeDepositedLink;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _depositButton;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _getTextDepositSuccessful;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountToBeWithdrawn;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _withdraw;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _getTransactionText;
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement _withdrawalLink;

    public void clickOnDepositButton() {
        Reporter.addStepLog("Clicking on deposit button " + _depositLink.toString());
        clickOnElement(_depositLink);
        log.info("Clicking on deposit button " + _depositLink.toString());
    }

    public void enterAmountToDeposit(String amount) {
        Reporter.addStepLog("Enter amount to deposit " + amount+ "Enter amount "+ _AmountToBeDepositedLink.toString());
        sendTextToElement(_AmountToBeDepositedLink, amount);
        log.info("Enter amount to deposit " +amount+ "Enter amount "+ _AmountToBeDepositedLink.toString());
    }

    public void clickDepositFeature() {
        Reporter.addStepLog("Clicking on deposit feature " + _depositButton.toString());
        clickOnElement(_depositButton);
        log.info("clicking on deposit feature " + _depositButton.toString());
    }

    public String getTextDepositSuccessfulMessage() {
        Reporter.addStepLog("Getting text deposit successful message " + _getTextDepositSuccessful.toString());
        log.info("Getting text deposit successful message " + _getTextDepositSuccessful.toString());
        return getTextFromElement(_getTextDepositSuccessful);
    }

    public void clickOnWithdrawal() {
        Reporter.addStepLog("Clicking on withdrawal button " + _withdrawalLink.toString());
        clickOnElement(_withdrawalLink);
        log.info("Clicking on withdrawal button " + _withdrawalLink.toString());
    }

    public void clickOnAmountWithdrawalButton(String withAmount) {
        Reporter.addStepLog("Clicking on withdrawal button " + withAmount+" withdrawal amount "+ _amountToBeWithdrawn.toString());
        sendTextToElement(_amountToBeWithdrawn, withAmount);
        log.info("Clicking on withdrawal button " + withAmount+ "withdrawal amount "+_amountToBeWithdrawn.toString());
    }

    public void clickOnWithdrawFeature() {
        Reporter.addStepLog("Clicking on withdrawal feature " + _withdraw.toString());
        clickOnElement(_withdraw);
        log.info("Clicking on withdrawal feature " + _withdraw.toString());
    }

    public String getTextTransaction() {
        Reporter.addStepLog("Getting text transaction message " + _getTransactionText.toString());
        log.info("Getting text transaction message " + _getTransactionText);
        return getTextFromElement(_getTransactionText);
    }



}
