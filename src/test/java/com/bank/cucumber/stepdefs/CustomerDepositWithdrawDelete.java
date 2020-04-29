package com.bank.cucumber.stepdefs;

import com.bank.pages.AccountPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.CustomerPage;
import com.bank.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Chaitanya
 */
public class CustomerDepositWithdrawDelete {
    @And("^I search customer that is created$")
    public void iSearchCustomerThatIsCreated() {
        new CustomerPage().clickOnYourName();

    }

    @And("^I click on deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @When("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String amount) {
        new AccountPage().enterAmountToDeposit(amount);

    }

    @Then("^I should see deposit amount successfully$")
    public void iShouldSeeDepositAmountSuccessfully() {
//        String expectedResult ="Deposit Successful";
//        String actualResult = new AccountPage().getTextDepositSuccessfulMessage();
        //Assert.assertEquals(expectedResult,actualResult);

    }

    @And("^I select searched customer$")
    public void iSelectSearchedCustomer() {
        new CustomerPage().clickOnSelectName();
    }

    @And("^I click on withdrawal button$")
    public void iClickOnWithdrawalButton() {
        new AccountPage().clickOnWithdrawal();
    }

    @Then("^I customer should withdrawal amount successfully$")
    public void iCustomerShouldWithdrawalAmountSuccessfully() {

    }

    @And("^I click on bank manager login button$")
    public void iClickOnBankManagerLoginButton() {
        new HomePage().clickOnBankManagerLoginButton();
    }

    @And("^I click on customer button$")
    public void iClickOnCustomerButton() {
        new BankManagerLoginPage().clickOnCustomerButton();
    }

    @When("^I click on searched customer$")
    public void iClickOnSearchedCustomer() {
        new BankManagerLoginPage().clickOnSearchCustomer();
    }

    @And("^I click on delete customer button$")
    public void iClickOnDeleteCustomerButton() {
        new BankManagerLoginPage().clickToDeleteCustomer();
    }

    @Then("^I should delete customer successfully$")
    public void iShouldDeleteCustomerSuccessfully() {
    }

    @And("^I click select name \"([^\"]*)\"$")
    public void iClickSelectName(String name){
        new BankManagerLoginPage().clickOnSearchCustomer();

    }
}
