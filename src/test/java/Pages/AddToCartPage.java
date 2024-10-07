package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static StepDefinitions.BaseStep.driver;

public class AddToCartPage {
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"NopStation Cart\"]")
    public WebElement openApp;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[4]")
    public WebElement electronicsMenu;

    @FindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/itemView\"])[4]/android.view.ViewGroup")
    public WebElement selectMattress;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnPlus\"]")
    public WebElement plusIcon;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart\"]")
    public WebElement addToCart;

    public AddToCartPage(AndroidDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void user_open_mobile_app() throws Exception{
        openApp.click();
        Thread.sleep(1000);
    }

    public void click_on_electronics_menu() throws Exception{
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Electronics\"))"));
        electronicsMenu.click();
        Thread.sleep(1000);
    }

    public void click_on_mattress_bed() throws Exception{
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Mattress Bedroom\"))"));
        selectMattress.click();
        Thread.sleep(1000);
    }

    public void click_on_plus_icon() throws Exception{
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"+\"));"));
        plusIcon.click();
        Thread.sleep(1000);
    }

    public void click_add_to_cart_button() throws Exception{
        addToCart.click();
        driver.quit();
        Thread.sleep(1000);

    }
}
