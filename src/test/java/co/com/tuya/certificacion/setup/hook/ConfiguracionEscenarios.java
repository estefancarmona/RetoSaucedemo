package co.com.tuya.certificacion.setup.hook;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.tuya.certificacion.enums.configuracion.Actor.CLIENTE;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class ConfiguracionEscenarios {

    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
        theActor(CLIENTE.getNombre());
    }
}
