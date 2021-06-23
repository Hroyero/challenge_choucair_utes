package co.com.choucar.bancolombia.utest.practica.tasks;

import co.com.choucar.bancolombia.utest.practica.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static co.com.choucar.bancolombia.utest.practica.userinterface.UtestFillOutAboutYourselft.*;
import java.util.List;

public class FillOutAboutYourselft implements Task {
    List<UtestData> utestData;

    public FillOutAboutYourselft(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static FillOutAboutYourselft onThePage(List<UtestData> utestData) {
        return Tasks.instrumented(FillOutAboutYourselft.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(utestData.get(0).getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(utestData.get(0).getStrEmailAddress()).into(INPUT_EMAIL),
                SelectFromOptions.byValue(utestData.get(0).getStrMonth()).from(DATE_OF_BIRTH_MONTH),
                SelectFromOptions.byValue(utestData.get(0).getStrDay()).from(DATE_OF_BIRTH_DAY),
                SelectFromOptions.byValue(utestData.get(0).getStrYear()).from(DATE_OF_BIRTH_YEAR),
                Click.on(INPUT_LIST_LANGUAGE),
                Click.on(SELECT_LANGUAGE),
                Click.on(BUTTON_NEXT_LOCATION));
    }
}
