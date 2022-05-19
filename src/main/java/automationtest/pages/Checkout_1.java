package automationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_1 {
	WebDriver driver;
	
    @FindBy(xpath="//*[@id=\"first-name\"]")
    WebElement Firstname;
    @FindBy(xpath="//*[@id=\"last-name\"]")
    WebElement Lastname;
    @FindBy(xpath="//*[@id=\"postal-code\"]")
    WebElement Postalcode;
    @FindBy(xpath="  //*[@id=\"continue\"]")
    WebElement Continue;
    
    public Checkout_1(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    //Click on login button
    
    
    public void Fillallfields() {
    	Firstname.click();
    	Firstname.sendKeys("Zuni"); 
    	Lastname.click();
    	Lastname.sendKeys("G"); 
    	Postalcode.click();
    	Postalcode.sendKeys("12344"); 
    }
    
    public void clickcontinue() {
    	Continue.click();
    }
    
    
    
}
