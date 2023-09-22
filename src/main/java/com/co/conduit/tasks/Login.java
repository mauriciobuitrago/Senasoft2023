package com.co.conduit.tasks;

import com.co.conduit.models.RegisterData;
import com.co.conduit.userinterfaces.LoginPage;
import com.co.conduit.userinterfaces.OptionComponent;
import groovy.util.logging.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.OpenUrl;

public class Login implements Task {

    RegisterData registerData;

    public Login(RegisterData registerData) {
        this.registerData = registerData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(OptionComponent.BTN_LOGIN));
        actor.attemptsTo(Enter.theValue(registerData.getEmail()).into(LoginPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(registerData.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_SIGNIN));
    }

    public static Login enter(RegisterData registerData) {
        return Tasks.instrumented(Login.class, registerData);
    }
}
