package dk.profac.jenkinstestmessenger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HelloSteps {
    String helloworld;
    String result = "Hello, world!";
    HelloController HC;

    @Given("^I have a function index that return a string saying Hello world$")
    public void I_initiating_HelloController(){
        HC = new HelloController();
    }

    @When("^I call index function$")
    public void I_set_helloworld_to_Hello_Controller_index_method_(){
        helloworld = HC.index();
    }

    @Then("^my string should be set to hello world$")
    public void the_result_should_be(){
        assertThat(helloworld, equalTo(result));
            }

}
