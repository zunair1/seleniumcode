package automationtest.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestRunner {
		 public WebDriver driver;
		 

@BeforeClass(groups= {"Smoke","Regression"})
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver.exe");
	//	WebDriverManager.chromedriver().setup();
	//	ChromeOptions options = new ChromeOptions();
       
      //  options.addArguments("--disable-dev-shm-usage");
     //   options.addArguments("--window-size=1400,800");  
        driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.get("https://www.saucedemo.com/");
		
			}

@AfterClass(groups= {"Smoke","Regression"})
	public void broweserClosure() {
	driver.close();
	}



}
