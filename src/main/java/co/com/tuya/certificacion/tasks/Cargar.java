package co.com.tuya.certificacion.tasks;

import net.serenitybdd.screenplay.Tasks;
import co.com.tuya.certificacion.interactions.CargarData;

import java.util.List;
import java.util.Map;

public class Cargar {

    public static CargarData datosCon(List<Map<String, Object>> testData) {
        return Tasks.instrumented(CargarData.class, testData);
    }


}
