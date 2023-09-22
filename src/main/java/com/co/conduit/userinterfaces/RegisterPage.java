package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target TXT_USERNAME = Target.the("ingresar usuario")
            .locatedBy("//input[@placeholder='Username']");

    public static final Target TXT_EMAIL = Target.the("ingresar Email")
            .locatedBy("//input[@placeholder='Email']");

    public static final Target TXT_PASSWORD = Target.the("ingresar password")
            .locatedBy("//input[@placeholder='Password']");

    public static final Target BTN_SIGNUP = Target.the("clic boton ingresar")
            .locatedBy("//button[@type='submit']");


}
