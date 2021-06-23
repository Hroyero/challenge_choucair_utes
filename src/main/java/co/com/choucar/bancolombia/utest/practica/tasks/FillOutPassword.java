package co.com.choucar.bancolombia.utest.practica.tasks;

import co.com.choucar.bancolombia.utest.practica.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucar.bancolombia.utest.practica.userinterface.UtestFillOutPassword.*;

import java.util.List;

public class FillOutPassword implements Task {
    List<UtestData> utestData;



    public FillOutPassword(List<UtestData> utestData){
        this.utestData = utestData;
    }

    public static FillOutPassword onThePage(List<UtestData> utestData ) {
        return Tasks.instrumented(FillOutPassword.class, utestData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrPassword()).into(INPUT_PASSWORD),
                         Enter.theValue(utestData.get(0).getStrConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                         Click.on(CHECK_STAY_INFORME),
                         Click.on(CHECK_ACCEPT_THE_TERMS_OF_USE),
                         Click.on(CHECK_ACCEPT_THE_SECURITY_POLICIES));
    }
}
