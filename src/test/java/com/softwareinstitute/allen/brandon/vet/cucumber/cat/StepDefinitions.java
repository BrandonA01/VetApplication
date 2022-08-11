package com.softwareinstitute.allen.brandon.vet.cucumber.cat;

import com.softwareinstitute.allen.brandon.vet.Cat;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "Yes" : "No";
    }
}
public class StepDefinitions{
    private String today;
    private String actualAnswer;
    Cat nala = new Cat(true, 4, "Nala", "Multicoloured");

    @Given("Cat is hungry")
    public void cat_is_hungry() {
        nala.setHungry(true);
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today="Friday";
    }
    @When("I ask whether it's Friday")
    public void i_ask_whether_it_s_friday() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, actualAnswer);
    }
}