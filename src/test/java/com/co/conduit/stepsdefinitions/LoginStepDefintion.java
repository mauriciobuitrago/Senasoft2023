package com.co.conduit.stepsdefinitions;

import com.co.conduit.models.RegisterData;
import com.co.conduit.tasks.Login;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class LoginStepDefintion {


    @When("^He user enter the credentials$")
    public void heUserEnterTheCredentials(List<RegisterData> registerDataList) {
        RegisterData registerData;
        registerData = registerDataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(registerData));
    }



}
