package automationtest.test;

import java.io.IOException;
import java.lang.reflect.Method;


import org.testng.annotations.Test;

import Helpers.Utils.ExtentReport.ExtentTestManager;
import automationtest.pages.CartPage;
import automationtest.pages.Checkout_1;
import automationtest.pages.Checkout_2;
import automationtest.pages.Checkout_Complete;
import automationtest.pages.InventoryPage;
import automationtest.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Helpers.Utils.propertiesreading.readproperties;

public class LoginTestCases extends TestRunner{
	
	
	readproperties read=new readproperties();
	LoginPage loginObjectOne;
	InventoryPage homePageObjectOne;
	CartPage cartObject;
	Checkout_1 checkoutobject_1;
	Checkout_2 checkoutobject_2;
	Checkout_Complete checkoutobject_Comp;
	ExtentTest test,test1;


 
@Test(priority=1,description="Verify that User can login with correct username and password", groups={"Smoke","Regression"})

public void successfullUserLogin(Method method) throws InterruptedException, IOException{
	loginObjectOne=new LoginPage(driver);
	test=ExtentTestManager.startTest(method.getName(),"Verify that User can login with correct username and password");
	
	test.log(LogStatus.PASS, "Login with username and password");
	String username=read.readprops("username");
	String password=read.readprops("password");
	loginObjectOne.loginToSauceDemo(username, password);
	test.log(LogStatus.PASS, "Login Successful on Inventorypage");
	Thread.sleep(3000);
	}
@Test(priority=2,description="Verify that User is on Invertory Page", groups={"Smoke","Regression"})

public void Inventory(Method method) throws InterruptedException{
	homePageObjectOne=new InventoryPage(driver);
	test1=ExtentTestManager.startTest(method.getName(),"Verify that User is on Invertory Page");
	test1.log(LogStatus.PASS, "Click on item to add to cart");
	homePageObjectOne.clickonitemtoaddtocart();
	test1.log(LogStatus.PASS, "Click on cart");
	homePageObjectOne.ClickonCart();
	Thread.sleep(3000);
	}

@Test(priority=3,description="Verify that User is on Cart Page", groups={"Smoke","Regression"})

public void Cart(Method method) throws InterruptedException{
	cartObject=new CartPage(driver);
	test=ExtentTestManager.startTest(method.getName(),"Verify that User is on Cart Page");
	test.log(LogStatus.PASS, "Verify remove button exists");
	cartObject.verifyremovebuttonexist();
	test.log(LogStatus.PASS, "click on checkout button");
	cartObject.ClickonCheckoutButton();
	Thread.sleep(3000);
	}


@Test(priority=4,description="Fill Checkout Form", groups={"Smoke","Regression"})

public void Checkout1(Method method) throws InterruptedException{
	checkoutobject_1=new Checkout_1(driver);
	test=ExtentTestManager.startTest(method.getName(),"Fill Checkout Form");
	test.log(LogStatus.PASS, "Verify that User is filling the form");
	checkoutobject_1.Fillallfields();
	test.log(LogStatus.PASS, "Continue button clicked");
	checkoutobject_1.clickcontinue();
	Thread.sleep(3000);
	}

@Test(priority=5,description="Verify the order", groups={"Smoke","Regression"})
public void Checkout2(Method method) throws InterruptedException{
	checkoutobject_2=new Checkout_2(driver);
	test=ExtentTestManager.startTest(method.getName(),"Verify the order");
	test.log(LogStatus.PASS, "Verify order successfully");
	checkoutobject_2.Clickonfinish();
	Thread.sleep(3000);
	}
@Test(priority=6,description="Verify text", groups={"Smoke","Regression"})
public void Checkout3(Method method) throws InterruptedException{
	checkoutobject_Comp=new Checkout_Complete(driver);
	test=ExtentTestManager.startTest(method.getName(),"Verify text present");
	test.log(LogStatus.PASS, "get text");
	String text_true=checkoutobject_Comp.verifytexttrue();
	assert text_true.equalsIgnoreCase("THANK YOU FOR YOUR ORDER");
}
}
 

