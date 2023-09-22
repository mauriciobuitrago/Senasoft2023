package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {


    public static final Target TXT_EMAIL = Target.the("ingresar Email")
            .locatedBy("//input[@placeholder='Email']");

    public static final Target TXT_PASSWORD = Target.the("ingresar password")
            .locatedBy("//input[@placeholder='Password']");

        public static final Target BTN_SIGNIN = Target.the("clic boton sign in")
            .locatedBy("//button[@type='submit']");



}
