package co.com.tuya.certificacion.tasks;

import co.com.tuya.certificacion.userinterfaces.IngresarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static co.com.tuya.certificacion.enums.configuracion.ConstantesTrasversales.CLAVE;
import static co.com.tuya.certificacion.enums.configuracion.ConstantesTrasversales.USUARIO;

public class IniciarSesion implements Task {

    private final Map<String, Object> testData;

    public IniciarSesion(Map<String, Object> testData) {
        this.testData = testData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(IngresarData.TXT_USUARIO),
                Enter.theValue(testData.get(USUARIO).toString()).into(IngresarData.TXT_USUARIO),
                Click.on(IngresarData.TXT_CLAVE),
                Enter.theValue(testData.get(CLAVE).toString()).into(IngresarData.TXT_CLAVE),
                Click.on((IngresarData.BTN_LOGIN))

        );

    }

    public static IniciarSesion con(Map<String, Object> testData) {
        return new IniciarSesion(testData);
    }
}
