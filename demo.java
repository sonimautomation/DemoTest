package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class demo implements Runnable {
   
    String port;
    String udid;
   
    public demo(String portNumber, String udid) {
        this.port = portNumber;
        this.udid = udid;
    }
   
    @AndroidFindBy(id="com.amazon.mShop.android.shopping:id/action_bar_burger_icon")
    private WebElement hamburgerIcon;
   
    @AndroidFindBy(id="com.amazon.mShop.android.shopping:id/gno_greeting_text_view")
    private WebElement hello;
   
    @AndroidFindBy(id="ap_email")
    private WebElement email;
   
    @AndroidFindBy(id="ap_password")
    private WebElement password;
   
    AppiumDriver<WebElement> driver;
    DesiredCapabilities capabilities = new DesiredCapabilities();
   
   
    private void openAppAndPerformSomeActions() {
        capabilities.setCapability("deviceName", "XP8800");
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.contacts");
        capabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
       
        try {
            driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:" + port + "/wd/hub"), capabilities);
            Thread.sleep(10000);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
       
        hamburgerIcon.click();
        hello.click();
    }
   
    public static void main(String args[]) {
    
    	Runnable  r1 = new demo("5000", "ff44ca32");
    	new Thread(r1).start();
       /* Runnable r1 = new demo("5000", "ff44ca32"); //device id of first mobile device
        Runnable r2 = new demo("4723", "ff44cae8"); //device id of second mobile device
*/        /*new Thread(r1).start();
        new Thread(r2).start();*/
    }

    @Override
    public void run() {
        openAppAndPerformSomeActions();
    }
}