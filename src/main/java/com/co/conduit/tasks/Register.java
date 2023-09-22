package com.co.conduit.tasks;

import com.co.conduit.userinterfaces.OptionComponent;
import com.co.conduit.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OptionComponent.BTN_SIGNUP),
                Enter.theValue("mbuitrago").into(RegisterPage.TXT_USERNAME),
                Enter.theValue("maobb19@yopmail.com").into(RegisterPage.TXT_EMAIL),
                Enter.theValue("1234").into(RegisterPage.TXT_PASSWORD),
                Click.on(RegisterPage.BTN_SIGNUP));
    }

    public static Register enter() {
        return Tasks.instrumented(Register.class);
    }


}
