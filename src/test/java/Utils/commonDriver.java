package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commonDriver {

		protected static WebDriver driver;
		
		//common method to invoke the browser
		public void invokeBrowser() throws Exception {
			System.setProperty("webdriver.gecko.driver", "C:/Users/abc/Downloads/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(601, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(801, TimeUnit.SECONDS);
		}

}
