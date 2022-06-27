package com.amazon.step_definitions;

import com.amazon.pages.MainPage;
import com.amazon.pages.ResultPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IphoneSearch_StepDefinitions {

    MainPage mainPage = new MainPage();
    ResultPage resultPage = new ResultPage();

    @Given("User is at amazon main page")
    public void user_is_at_amazon_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon.url"));
        mainPage.acceptCookies.click();

    }
    @When("User search {string}")
    public void user_search(String string) {
        mainPage.searchBox.sendKeys(string+ Keys.ENTER);
    }
    @When("User can see the results are listed")
    public void user_can_see_the_results_are_listed() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone13"));
    }
    @When("User clicks iPhone13 at the top of the list")
    public void user_clicks_i_phone13_at_the_top_of_the_list() {
        resultPage.firstProductLink.click();
    }
    @Then("User log the phone information")
    public void user_log_the_phone_information() {
        resultPage.logInformation();

    }

}
