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
public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());


    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement _addCustomerLink;
    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement _clickOnCustomerFeature;
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _searchCustomer;
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _enterCustomer;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement _deleteCustomer;

    public void clickOnAddCustomerFeature() {
        Reporter.addStepLog("Clicking to add customer " + _addCustomerLink.toString());
        clickOnElement(_addCustomerLink);
        log.info("Clicking to add customer " + _addCustomerLink.toString());
    }

    public void clickOnCustomerButton() {
        Reporter.addStepLog("Clicking on customer button " + _clickOnCustomerFeature.toString());
        clickOnElement(_clickOnCustomerFeature);
        log.info("Clicking on customer button " + _clickOnCustomerFeature.toString());
    }

    public void clickOnSearchCustomer() {
        Reporter.addStepLog("Clicking button to search customer " + _searchCustomer.toString());
        clickOnElement(_searchCustomer);
        log.info("Clicking button to search customer " + _searchCustomer.toString());
    }

    public void enterCustomerName(String customerName) {
        Reporter.addStepLog("Entering customer name " + customerName + "Customer name field" + _enterCustomer.toString());
        sendTextToElement(_enterCustomer, customerName);
        log.info("Entering customer name " + customerName + "Customer name field" + _enterCustomer.toString());
    }

    public void clickToDeleteCustomer() {
        Reporter.addStepLog("Clicking to delete customer " + _deleteCustomer.toString());
        clickOnElement(_deleteCustomer);
        log.info("Clicking to delete customer " + _deleteCustomer.toString());
    }


}
