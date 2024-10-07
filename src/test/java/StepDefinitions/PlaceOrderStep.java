package StepDefinitions;

import Pages.PlaceOrderPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.*;
import io.cucumber.java.ja.但し;

import java.util.concurrent.TimeUnit;

public class PlaceOrderStep {
    public AndroidDriver driver;

    PlaceOrderPage place_order_page;

    public PlaceOrderStep() throws Exception{
        this.driver = BaseStep.Setup();
        place_order_page = new PlaceOrderPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("Mike go to shopping cart by clicking top cart icon")
    public void mike_go_to_shopping_cart_by_clicking_top_cart_icon() throws Exception {
        place_order_page.click_cart_icon();
    }
    @When("Mike click checkout button from shopping cart page")
    public void mike_click_checkout_button_from_shopping_cart_page() throws Exception {
       place_order_page.click_check_out_button();
    }
    @And("Mike select checkout as guest from shopping cart page")
    public void mike_select_checkout_as_guest_from_shopping_cart_page() throws Exception {
        place_order_page.click_guest_user_button();

    }
    @Then("Mike input all the details in checkout billing details page and click continue")
    public void mike_input_all_the_details_in_checkout_billing_details_page_and_click_continue() throws Exception {
        place_order_page.input_all_details();
    }
    @And("Mike select \"Next Day Air\" as shipping method and click continue")
    public void mike_select_as_shipping_method_and_click_continue() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("Mike select \"Check/Money Order\" as payment method and click continue")
    public void mike_select_as_payment_method_and_click_continue() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("Mike click next button on payment information page")
    public void mike_click_next_button_on_payment_information_page()throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Mike click confirm button to place the order")
    public void mike_click_confirm_button_to_place_the_order() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("Verify order place successfully with popup message \"Your order has been successfully processed!\"")
    public void verify_order_place_successfully_with_popup_message(String string) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
