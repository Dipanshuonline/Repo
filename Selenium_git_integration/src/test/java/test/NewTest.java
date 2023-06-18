package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver configuration
        System.setProperty("webdriver.chrome.driver", "/var/jenkins_home/workspace/selenium_integration/Selenium_git_integration/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
      
        driver.get("https://www.google.com");

        // Perform actions on the page
        // ...

        // Add your assertions to verify expected results
        // ...

        // Example assertion
        String pageTitle = driver.getTitle();
        assert pageTitle.contains("Google") : "Google homepage is not displayed";
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver
        driver.quit();
    }
}
