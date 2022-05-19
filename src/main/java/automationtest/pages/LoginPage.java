package automationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    /**
     * All WebElements are identified by @FindBy annotation
     */
	
	//Positive Scenario - login
    WebDriver driver;
    @FindBy(name="user-name")
    WebElement userLoginEmail;
    @FindBy(name="password")
    WebElement userLoginPassword;    
    @FindBy(id="login-button")
    WebElement login;
    
    //Positive Scenario - logout
    public LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
    	userLoginEmail.sendKeys(strUserName);     
    }
    //Set password in password textbox
    public void setPassword(String strPassword){
    	userLoginPassword.sendKeys(strPassword);
    }
    //Click on login button
    public void clickLogin(){
            login.click();
    }
   
    
    public void loginToSauceDemo(String strUserName,String strPassword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPassword);
        //Click Login button
        this.clickLogin();
        
        
    }
   
   
}