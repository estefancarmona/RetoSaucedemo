package co.com.tuya.certificacion.interactions;

import co.com.tuya.certificacion.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.annotations.Subject;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CargarData implements Interaction {

    private final List<Map<String, Object>> testData;

    public CargarData(List<Map<String, Object>> testData) {
        this.testData = testData;
    }

    @Subject("Se recorre la informacion del feature")
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!testData.isEmpty()) {
            Set<Map.Entry<String, Object>> setMapaAux = testData.get(0).entrySet();
            Map<String, Object> mapAux = setMapaAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if (TestData.info() == null) {
                TestData.setMap(mapAux);
            } else {
                TestData.info().putAll(mapAux);
            }

        }
    }



}
