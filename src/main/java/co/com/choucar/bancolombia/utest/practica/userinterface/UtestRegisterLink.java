package co.com.choucar.bancolombia.utest.practica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterLink {
    public static final Target JOIN_TODAY_BUTTON = Target.the("Button that shows us the from to register").located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));

}
