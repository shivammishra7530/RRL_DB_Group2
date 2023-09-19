package StepDefinition;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
//import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAfter extends Tools {

	
	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
	}
	
	@After
	public void tearDown() {
	driver.quit();
	}
	
}
