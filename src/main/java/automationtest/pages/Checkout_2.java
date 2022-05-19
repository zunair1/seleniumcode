package automationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_2 {
	WebDriver driver;
	
    @FindBy(xpath="//*[@id=\"finish\"]")
    WebElement finish;
    
    public Checkout_2(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    //Click on login button
    
    
    public void Clickonfinish() {
    Actions clickon=new Actions(driver);	
    clickon.moveToElement(finish).click().build().perform();
    }
    
    
    
}
