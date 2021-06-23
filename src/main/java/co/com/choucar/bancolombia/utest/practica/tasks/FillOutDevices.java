package co.com.choucar.bancolombia.utest.practica.tasks;


import static co.com.choucar.bancolombia.utest.practica.userinterface.UtestFillOutDevices.*;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class FillOutDevices implements Task {


    public static FillOutDevices onThePage() {
        return Tasks.instrumented(FillOutDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_CLOSE_AUTODETECTED));
        actor.attemptsTo(Click.on(INPUT_LIST_COMPUTER));
        actor.attemptsTo(Click.on(SELECT_COMPUTER));
        actor.attemptsTo(Click.on(INPUT_LIST_VERSION));
        actor.attemptsTo(Click.on(SELECT_VERSION));
        actor.attemptsTo(Click.on(INPUT_LIST_LANGUAGE));
        actor.attemptsTo(Click.on(SELECT_LANGUAGE));
        actor.attemptsTo(Click.on(BUTTON_NEXT_LAST_STEP));

    }
}