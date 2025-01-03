package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import pageObjects.PageObjectManager;
import utils.Test;

public class CheckoutPageStepDefinitions {
    public Test test;

   public CheckOutPage checkOutPage;
    public CheckoutPageStepDefinitions(Test test){
        this.test=test;
        this.checkOutPage= test.pageObjectManager.getCheckOutPage();
    }

    @Then("^user proceeds to checkout and validate (.+) items in the checkout page$")
    public void user_proceeds_to_checkout_and_validate_items_in_the_checkout_page(String name) throws InterruptedException {
        checkOutPage.checkOutItems();
        Thread.sleep(2000);
        //Assertion to extract name from screen and compare with the name


    }
    @Then("user has ability to enter promo code and place the order")
    public void user_has_ability_to_enter_promo_code_and_place_the_order() {
        //checkOutPage= test.pageObjectManager.getCheckOutPage();
        checkOutPage.verifyPromoButton();
        checkOutPage.verifyPlaceOrder();

    }

}
