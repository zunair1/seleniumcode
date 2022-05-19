package automationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Complete {
	WebDriver driver;
	
    @FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
    WebElement verifytext;
    
    public Checkout_Complete(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    //Click on login button
    
    
    public String verifytexttrue() {
    	return verifytext.getText();
    
    }
    
  
    
}
