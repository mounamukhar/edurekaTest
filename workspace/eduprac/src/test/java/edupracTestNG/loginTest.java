package edupracTestNG;

import org.testng.annotations.Test;

public class loginTest {
	
	@Test
	public static void test1() throws InterruptedException{
		
		//System.setProperty("webdriver.firefox.marionette","/home/ubuntu/edureka_practice/SeleniumSite/drivers/geckodriver");
		//WebDriver driver = new FirefoxDriver();
 	
        String baseUrl = "http://localhost:3001/";
        //driver.quit();
		//String baseUrl = "http://www.yahoo.com";
        System.out.println("Selenium script executed!");
		
	}

}
