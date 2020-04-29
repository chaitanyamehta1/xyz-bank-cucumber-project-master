package com.bank.cucumber.stepdefs;

import com.bank.basepage.BasePage;
import com.bank.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

/**
 * Created by Chaitanya
 */
public class BankManagerAndCustomer extends BasePage {
    @Given("^I am on the Home Page$")
    public void iAmOnTheHomePage() {
    }

    @And("^I click On bank manager login tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginButton();
    }

    @And("^I click on add customer tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerFeature();
    }

    @When("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        new AddCustomerPage().enterFirstName(firstName);


    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new AddCustomerPage().enterLastName(lastName);

    }

    @And("^I enter postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postcode) {
        new AddCustomerPage().enterPostCode(postcode);

    }

    @And("^I click on add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @Then("^System should display popup message Click on ok button on pop up$")
    public void systemShouldDisplayPopupMessageClickOnOkButtonOnPop() {
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Customer added successfully"));
        alert.accept();

    }

    @And("^System shows customer added successfully message$")
    public void systemShowsCustomerAddedSuccessfullyMessage() {

    }

    @And("^I click on open account button$")
    public void iClickOnOpenAccountButton() {
        new OpenAccountPage().clickOnOpenAccountButton();
    }

    @When("^I select customer first name$")
    public void iSelectCustomerFirstName() {
        new OpenAccountPage().selectCustomerFirstName();
    }

    @And("^I click on selected currency button$")
    public void iClickOnSelectedCurrencyButton() {
        new OpenAccountPage().clickOnCurrencyButton();
    }

    @And("^I select currency as pound$")
    public void iSelectCurrencyAsPound() {
        new OpenAccountPage().selectCurrencyPound();
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @Then("^I can see message account created successfully$")
    public void iCanSeeMessageAccountCreatedSuccessfully() {
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Account created successfully"));
        alert.accept();
    }

    @And("^I click on customer login button$")
    public void iClickOnCustomerLoginButton() {
        new HomePage().clickOnCustomerLoginButton();
    }

    @And("^I click on to search your name$")
    public void iClickOnToSearchYourName() {
        new CustomerPage().clickOnYourName();
    }

    @When("^I click select name$")
    public void iClickSelectName() {
        new CustomerPage().clickOnSelectName();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new CustomerPage().clickOnLoginButton();
    }

    @Then("^I should be login successfully and displayed logout message$")
    public void iShouldBeLoginSuccessfullyAndDisplayedLogoutMessage() {
        Assert.assertEquals(new CustomerLoginPage().getLogoutFeature(), "Logout");
    }

    @And("^I click on logout tab$")
    public void iClickOnLogoutTab() {
        new CustomerLoginPage().clickLogoutFeature();
    }

    @And("^I should see displayed your name$")
    public void iShouldSeeDisplayedYourName() {
        Assert.assertTrue(new CustomerPage().getYourNameMessage(), true);
    }


}
