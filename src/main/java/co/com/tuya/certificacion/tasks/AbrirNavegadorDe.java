package co.com.tuya.certificacion.tasks;

import co.com.tuya.certificacion.userinterfaces.AbrirPaginaWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegadorDe implements Task {

    private AbrirPaginaWeb abrirPaginaWeb;

    public static AbrirNavegadorDe laPagina(){
        return Tasks.instrumented(AbrirNavegadorDe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPaginaWeb));
    }
}
