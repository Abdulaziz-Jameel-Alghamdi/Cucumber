package Runner.HomeWork;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class run the feauters file
@RunWith(Cucumber.class)
@CucumberOptions(


        glue = "stepdefinitions",
        features = "src/test/resources/feauters/",
        tags = "@HomeWork2",
        plugin = {

                "html:cucmber-report/report1.html"
        },
        dryRun = true


)
public class runner_HW2 {

}
