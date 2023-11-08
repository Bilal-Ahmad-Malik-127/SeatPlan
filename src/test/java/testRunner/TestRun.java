package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features",
		glue="stepDefinations",
		dryRun=true,
		monochrome=false,
		plugin= {"pretty","html:test-output.html"
				},
<<<<<<< HEAD
		publish=true
=======
		publish=true,
		tags="@TicketingCalendar" 
>>>>>>> 13dc9aa65dc16b918ee00f3950f60b89cfbd905e
		)
public class TestRun {

}
