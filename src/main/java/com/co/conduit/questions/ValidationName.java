package com.co.conduit.questions;

import com.co.conduit.userinterfaces.OptionComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidationName implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(OptionComponent.LBL_NAME).viewedBy(actor).asBoolean();
    }


    public static ValidationName compare(){
        return new ValidationName();
    }
}
