package co.com.choucar.bancolombia.utest.practica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFillOutAddress {

    public static final Target INPUT_CITY = Target.the("where we select the city").located(By.xpath("//input[@id='city']"));
    public static final Target INPUT_POSTAL = Target.the("where we write the zip code").located(By.xpath("//input[@id='zip']"));
    public static final Target INPUT_COUNTRY = Target.the("where we write the country where we live").located(By.xpath("//span[contains(text(),'Colombia')]"));
    public static final Target SELECT_COUNTRY = Target.the("select country").located(By.xpath("//div[contains(text(),'Colombia')]"));
    public static final Target BUTTON_NEXT_DEVICES  = Target.the("button for the next devices").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}
