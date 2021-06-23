package co.com.choucar.bancolombia.utest.practica.tasks;

import co.com.choucar.bancolombia.utest.practica.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import co.com.choucar.bancolombia.utest.practica.userinterface.UtestFillOutAdd;

import java.util.List;

public class FillOutAddres implements Task {
    List<UtestData> utestData;



    public FillOutAddres(List<UtestData> utestData){
        this.utestData = utestData;
    }

    public static FillOutAddres onThePage(List<UtestData> utestData ) {
        return Tasks.instrumented(FillOutAddres.class, utestData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrCity()).into(UtestFillOutAdd.INPUT_CITY),
                         Hit.the(Keys.ARROW_DOWN).into(UtestFillOutAdd.INPUT_CITY),
                         Hit.the(Keys.ENTER).into(UtestFillOutAdd.INPUT_CITY),
                         Enter.theValue(utestData.get(0).getStrPostal()).into(UtestFillOutAdd.INPUT_POSTAL),
                         Click.on(UtestFillOutAdd.INPUT_COUNTRY),
                         Click.on(UtestFillOutAdd.SELECT_COUNTRY),
                         Click.on(UtestFillOutAdd.BUTTON_NEXT_DEVICES));
    }
}
