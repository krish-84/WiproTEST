package StepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import Utils.commonDriver;

public class testHooks extends commonDriver{
	@Before
	public void setUp() throws Exception {
		invokeBrowser();

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
