package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OptionComponent {

    public static final Target BTN_SIGNUP = Target.the("clic en el elemento sign up")
            .locatedBy("//a[contains(@href,'/register')]");

    public static final Target LBL_NAME = Target.the("validacion de nombre")
            .locatedBy("//a[contains(@href,'/profile/')]");




}
