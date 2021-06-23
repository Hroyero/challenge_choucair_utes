package co.com.choucar.bancolombia.utest.practica.tasks;

import co.com.choucar.bancolombia.utest.practica.userinterface.UtestRegisterLink;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterLink implements Task {
    private UtestRegisterLink utestRegisterLink;
    public static RegisterLink inUtest() {
        return Tasks.instrumented(RegisterLink.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterLink.JOIN_TODAY_BUTTON));
    }
}
