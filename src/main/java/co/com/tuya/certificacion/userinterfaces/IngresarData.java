package co.com.tuya.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarData {

    public static final Target TXT_USUARIO = Target.the("Txt ingresar usuario")
            .located(By.xpath("//input[@id='user-name']"));


    public static final Target TXT_CLAVE = Target.the("Txt ingresar clave")
            .located(By.xpath("//input[@id='password']"));


    public static final Target BTN_LOGIN = Target.the("btn login")
            .located(By.xpath("//input[@id='login-button']"));

}
