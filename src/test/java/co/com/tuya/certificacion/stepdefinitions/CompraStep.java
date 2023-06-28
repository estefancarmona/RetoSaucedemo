package co.com.tuya.certificacion.stepdefinitions;

import co.com.tuya.certificacion.models.TestData;
import co.com.tuya.certificacion.tasks.AbrirNavegadorDe;
import co.com.tuya.certificacion.tasks.Cargar;
import co.com.tuya.certificacion.tasks.IniciarSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStep {


    @Dado("^que el usuario ingreso a la pagina Saucedemo$")
    public void queElUsuarioIngresoALaPaginaSaucedemo() {
        theActorInTheSpotlight().wasAbleTo(
                AbrirNavegadorDe.laPagina());
    }
    @Cuando("^digita los datos de usuario$")
    public void digitaLosDatosDeUsuario(List<Map<String, Object>> testData) {
        theActorInTheSpotlight().attemptsTo(
                Cargar.datosCon(testData),
                IniciarSesion.con(TestData.info())
        );

    }

    @Cuando("^le da clic login$")
    public void leDaClicLogin() {

    }

    @Entonces("^visualizara el inicio de la pagina$")
    public void visualizaraElInicioDeLaPagina() {

    }


    @Cuando("^agrega los producto al carrito de compra$")
    public void agregaLosProductoAlCarritoDeCompra() {

    }

    @Cuando("^realiza el proceso de compra$")
    public void realizaElProcesoDeCompra() {

    }

    @Entonces("^se valida el producto (.*)$")
    public void seValidaElProductoSauceLabsBackpack() {

    }

    @Entonces("^se valida el valor del producto sea (.*)$")
    public void seValidaElValorDelProductoSea$(int arg1, int arg2) {

    }

    @Cuando("^agrega (.*)$ producto al carrito de compra$")
    public void agregaProductoAlCarritoDeCompra(int arg1) {

    }

    @Cuando("^remueve un producto del carrito$")
    public void remueveUnProductoDelCarrito() {

    }

    @Entonces("^se valida los (.*)$ articulos en el carrito$")
    public void seValidaLosArticulosEnElCarrito(int arg1) {

    }

    @Cuando("^agrega dos producto al carrito de compra$")
    public void agregaDosProductoAlCarritoDeCompra() {

    }
}
