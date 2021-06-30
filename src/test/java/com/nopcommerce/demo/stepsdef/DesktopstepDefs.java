package com.nopcommerce.demo.stepsdef;

import com.nopcommerce.demo.page.Computer;
import com.nopcommerce.demo.page.Desktop;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DesktopstepDefs {
    @When("^I click on Computers tab$")
    public void iClickOnComputersTab() {
        new Desktop().clickonComputer();
    }

    @And("^I click on desktop tab$")
    public void iClickOnDesktopTab()throws InterruptedException {
        new Computer().clickOndesktopTab();

    }

    @And("^I select \"([^\"]*)\" from dropdown list$")
    public void iSelectFromDropdownList(String sortby)  {
        new Desktop().selectFromDropdownMenu(sortby);

    }

    @Then("^I should see products arranged in reverse alphabetical order$")
    public void iShouldSeeProductsArrangedInReverseAlphabeticalOrder() {
        new Computer().sortbyDesendingorder();

    }
}
