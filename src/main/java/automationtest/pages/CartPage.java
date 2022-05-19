package automationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	
    @FindBy(xpath="//*[@id=\"remove-sauce-labs-backpack\"]")
    WebElement VerifyRemovebutton;
    @FindBy(xpath="//*[@id=\"checkout\"]")
    WebElement Checkoutbutton;
   
    public CartPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    //Click on login button
    
    
    public void verifyremovebuttonexist() {
    	String text=VerifyRemovebutton.getText();
    	assert text.equals("REMOVE");
    }
    
    public void ClickonCheckoutButton() {
    	Checkoutbutton.click();
    } 
}
