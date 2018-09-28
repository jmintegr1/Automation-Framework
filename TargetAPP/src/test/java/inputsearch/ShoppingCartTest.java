package inputsearch;

import HomePageTarget.TargetShoppingCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TargetShoppingCart {

    TargetShoppingCart ObjShoppingCart;

    @BeforeMethod
    public void init (){
        ObjShoppingCart = PageFactory.initElements(driver, TargetShoppingCart.class);
    }

    @Test
    public void ClickOnShoppingCart(){
        clickOnShoppingCart();
    }
    @Test
    public void ClickOnAddQuantity(){
        clickOnAddQuantity();
    }
    @Test
    public void ClickOnChangeQuantity(){
        clickOnChangeQuantity();
    }
    @Test
    public void ClickOnShipping(){
        clickOnShipping();
    }
    @Test
    public void ClickShippingToStore(){
        clickOnOrderIncludesAGift();
    }
}
