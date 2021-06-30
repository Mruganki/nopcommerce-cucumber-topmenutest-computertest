package com.nopcommerce.demo.stepsdef;

import com.nopcommerce.demo.page.BuildYourOwnPage;
import com.nopcommerce.demo.page.Computer;
import com.nopcommerce.demo.page.Desktop;
import com.nopcommerce.demo.page.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuildyourownPagestepsDefs {
    @And("^I click on \"([^\"]*)\"Tab$")
    public void iClickOnTab(String menu)  {
        new HomePage().selectMenu(menu);

    }

    @And("^I click on  desktop tab$")
    public void iClickOnDesktopTab() throws InterruptedException {
        new Computer().clickOndesktopTab();
    }

    @And("^I click on 'add to cart' button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new Desktop().clickOnAddToCartButton();
    }

    @When("^I see 'build your own' page$")
    public void iSeeBuildYourOwnPage() {
        Assert.assertEquals("Build your own computer",new BuildYourOwnPage().getBuildyourOwnPageText());

    }

    @And("^I select processor \"([^\"]*)\" from dropdown$")
    public void iSelectProcessorFromDropdown(String processor)  {
        new BuildYourOwnPage().selectProcessorFromDropDownList(processor);

    }

    @And("^I select Ram \"([^\"]*)\" from dropdownlist$")
    public void iSelectRamFromDropdownlist(String ram)  {
        new BuildYourOwnPage().selectRamFromDropDownTwo(ram);

    }

    @And("^I click on HDD \"([^\"]*)\" radio buttton$")
    public void iClickOnHDDRadioButtton(String arg0)  {
        new BuildYourOwnPage().clickOnHDDRadioButton();

    }

    @And("^I click on OS \"([^\"]*)\" radio button$")
    public void iClickOnOSRadioButton(String arg0)  {
        new BuildYourOwnPage().clickOSOnRadioButton();

    }

    @And("^I click Two check boxes \"([^\"]*)\" and \"([^\"]*)\"checkbox$")
    public void iClickTwoCheckBoxesAndCheckbox(String arg0, String arg1)  {
        new BuildYourOwnPage().clickOnSoftwareCheckBox();

    }

    @And("^I verify price \"([^\"]*)\"$")
    public void iVerifyPrice(String arg0) {
        Assert.assertEquals("$1,475.00",new BuildYourOwnPage().getTotalAmt());


    }

    @And("^I click on \"([^\"]*)\" Button\\.$")
    public void iClickOnButton(String arg0)  {
        new BuildYourOwnPage().clickOnAddToCart();

    }

    @Then("^I should see Message on top green bar like \"([^\"]*)\"$")
    public void iShouldSeeMessageOnTopGreenBarLike(String arg0)  {
        Assert.assertEquals("The product has been added to your shopping cart",new BuildYourOwnPage().getPopUpBarMessage());

    }
}
