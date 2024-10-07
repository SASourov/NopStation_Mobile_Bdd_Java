package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefinitions.BaseStep.driver;

public class PlaceOrderPage {
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Placeholder\"]")
    public WebElement cartIcon;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut\"]")
    public WebElement checkOutButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout\"]")
    public WebElement checkOutGuest;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFirstName\"]")
    public WebElement firstName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etLastName\"]")
    public WebElement lastName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etEmail\"]")
    public WebElement emailAddress;

    @FindBy(xpath = "//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/countrySpinner\"]")
    public WebElement countryList;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"android:id/text1\"])[2]")
    public WebElement selectCountry;

    @FindBy(xpath = "//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/stateSpinner\"]")
    public WebElement stateList;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"AA (Armed Forces Americas)\"]")
    public WebElement selectState;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCompanyName\"]")
    public WebElement companyName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCity\"]")
    public WebElement cityName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress\"]")
    public WebElement streetAddress;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etZipCode\"]")
    public WebElement zipCode;

    public PlaceOrderPage(AndroidDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void click_cart_icon() throws Exception{
        cartIcon.click();
        Thread.sleep(1000);
    }

    public void click_check_out_button() throws Exception{
        checkOutButton.click();
        Thread.sleep(1000);
    }

    public void click_guest_user_button() throws Exception{
        checkOutGuest.click();
        Thread.sleep(1000);
    }

    public void input_all_details() throws Exception{
        firstName.sendKeys("Mike");
        lastName.sendKeys("Hsi");
        Thread.sleep(1000);

        emailAddress.sendKeys("mike@mail.com");
        Thread.sleep(1000);

        countryList.click();
        selectCountry.click();
        Thread.sleep(1000);

        stateList.click();
        selectState.click();
        Thread.sleep(1000);

        companyName.sendKeys("Test Company");
        Thread.sleep(1000);

        cityName.sendKeys("Banani, Dhaka");
        Thread.sleep(1000);

        streetAddress.sendKeys("Road 15, House 123");
        Thread.sleep(1000);

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Zip/postal code\"))"));
        zipCode.sendKeys("12000");
        Thread.sleep(1000);

        driver.findElement(AppiumBy.accessibilityId("new UiSelector().resourceId(\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\").instance(1)")).click();

    }
}
