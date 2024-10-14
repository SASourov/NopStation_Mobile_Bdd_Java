package StepDefinitions;

import Pages.AddToCartPage;
import io.appium.java_client.android.AndroidDriver;;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

public class AddToCartStep {
    public AndroidDriver driver;

    AddToCartPage add_to_cart;

    public AddToCartStep() throws Exception{
        this.driver = BaseStep.Setup();
        add_to_cart = new AddToCartPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("Mike on home page after opening nopCart mobile app")
    public void Mike_on_home_page_after_opening_nopCart_mobile_app() throws Exception{
        add_to_cart.user_open_mobile_app();
    }

    @When("Mike click \"electronics\" from \"OUR CATEGORIES\" list from home page")
    public void Mike_click_electronics_from_OUR_CATEGORIES_list_from_home_page() throws Exception{
        add_to_cart.click_on_electronics_menu();
    }

    @And("Mike click to \"Mattress Bedroom\" product details page")
    public void Mike_click_to_Mattress_Bedroom_product_details_page() throws Exception{
        add_to_cart.click_on_mattress_bed();
    }

    @And("Mike click plus button to increase Qty by \"2\"")
    public void Mike_click_plus_button_to_increase_Qty_by_2() throws Exception{
        add_to_cart.click_on_plus_icon();
    }

    @Then("Mike click add to cart button to add the product in his cart")
    public void Mike_click_add_to_cart_button_to_add_the_product_in_his_cart() throws Exception{
        add_to_cart.click_add_to_cart_button();
    }
}