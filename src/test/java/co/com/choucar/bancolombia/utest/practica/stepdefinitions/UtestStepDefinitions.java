package co.com.choucar.bancolombia.utest.practica.stepdefinitions;

import co.com.choucar.bancolombia.utest.practica.model.UtestData;
import co.com.choucar.bancolombia.utest.practica.question.Answer;
import co.com.choucar.bancolombia.utest.practica.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^Hollmans wants to register in Utest$")
    public void hollmans_wants_to_register_in_Utest() {
        theActorCalled("Hollmans").wasAbleTo(OpenUp.thePage(),
               RegisterLink.inUtest());
    }

    @When("^he search for the option to registe and fill the registration form$")
    public void he_search_for_the_option_to_registe_and_fill_the_registration_form(List<UtestData> utestData)throws Exception{
        theActorInTheSpotlight().attemptsTo(FillOutAboutYourselft.onThePage(utestData),
                                            FillOutAddress.onThePage(utestData),
                                            FillOutDevices.onThePage(),
                                            FillOutPassword.onThePage(utestData)
                                            );
    }

    @Then("^he registers on the page$")
    public void he_registers_on_the_page(List<UtestData> utestData)throws Exception{
        theActorInTheSpotlight().should(seeThat(Answer.toThe(utestData.get(0).getStrRegistered())));
    }
}
