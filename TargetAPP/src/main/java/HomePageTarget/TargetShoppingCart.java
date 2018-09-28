package HomePageTarget;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetShoppingCart extends CommonAPI {

    @FindBy(
            xpath = "//*[@id=\"cart\"]"
    )
    public static WebElement ShoopingCart;
    @FindBy(
            xpath = "//*[@id=\"cart\"]"
    )
    public static WebElement AddQuantity;
    @FindBy(
            xpath = "//*[@id=\"select_58\"]"
    )
    public static WebElement ChangeQuantity;
    @FindBy(
            xpath = "//*[@id=\"cart-container\"]/div[1]/div[1]/div[5]/div[2]/div/div[2]/h2"
    )
    public static WebElement Shipping;
    @FindBy(
            xpath = "//*[@id=\"STEP_DELIVERYMETHOD\"]/div[2]/div[1]/div/div[3]/div/div/div/div[2]/div/label/div/div[1]/div[1]"
    )
    public static WebElement ShippingToStore;

    public TargetShoppingCart() {
    }

    public void clickOnShoppingCart() {
        ShoopingCart.click();
    }

    public void clickOnAddQuantity() {
        AddQuantity.click();
    }

    public void clickOnChangeQuantity() {
        ChangeQuantity.click();
    }

    public void clickOnShipping() {
        Shipping.click();
    }

    public void clickOnOrderIncludesAGift() {
        ShippingToStore.click();
    }
}


