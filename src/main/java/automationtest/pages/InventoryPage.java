package automationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InventoryPage {
	
	WebDriver driver;
	
    @FindBy(xpath="//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement Clickonitem;
    @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
    WebElement ClickonCartIcon;
   
    public InventoryPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    //Click on login button
    
    
    public void clickonitemtoaddtocart() {
    	Clickonitem.click();
    }
    
    public void ClickonCart() {
    	ClickonCartIcon.click();
    } 
}
