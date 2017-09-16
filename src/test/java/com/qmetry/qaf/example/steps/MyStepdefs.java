package com.qmetry.qaf.example.steps;


import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.example.PageObjects.Home;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

@QAFTestStepProvider
public class MyStepdefs {

    Home home;
    public MyStepdefs(){
        home = new Home();
    }

    @Given("^I am on first step$")
    public void iAmOnFirstStep() {
        home.getDriver().get("http://www.google.com/");
        System.out.println("first");
    }

    @And("^I logout$")
    public void iLogout() {
        home.tearDown();
    }
}
