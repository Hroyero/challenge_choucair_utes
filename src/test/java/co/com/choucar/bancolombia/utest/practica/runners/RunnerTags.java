package co.com.choucar.bancolombia.utest.practica.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_utest.feature",
        tags = "@stories",
        glue = "co.com.choucar.bancolombia.utest.practica.stepdefinitions"
)
public class RunnerTags {

}
