package co.com.choucar.bancolombia.utest.practica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFillOutAboutYourselft {
    public static final Target INPUT_FIRST_NAME = Target.the("Where we write the first name").located(By.cssSelector("#firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Where we write the last name").located(By.cssSelector("#lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where we write the email address").located(By.cssSelector("#email"));
    public static final Target DATE_OF_BIRTH_MONTH = Target.the("Where we select the month of birth").located(By.cssSelector("#birthMonth"));
    public static final Target DATE_OF_BIRTH_DAY = Target.the("Where we select the day of birth").located(By.cssSelector("#birthDay"));
    public static final Target DATE_OF_BIRTH_YEAR = Target.the("Where we select the year of birth").located(By.cssSelector("#birthYear"));
    public static final Target INPUT_LIST_LANGUAGE  = Target.the("list of languages (spoken)").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[5]/div[2]/div[1]/input[1]"));
    public static final Target SELECT_LANGUAGE  = Target.the("select spanish language (spoken)").located(By.xpath("//div[contains(text(),'Spanish')]"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button next location").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));

}
