package co.com.choucar.bancolombia.utest.practica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisteredUser {
    public static final Target REGISTERED_USER = Target.the("Extract welcome message to utest").located(By.xpath("//span[contains(text(),'Complete Setup')]"));

}
