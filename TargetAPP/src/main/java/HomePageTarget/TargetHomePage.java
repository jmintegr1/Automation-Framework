package HomePageTarget;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TargetHomePage extends CommonAPI {

    @FindBy(
            xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[1]/a/span"
    )
    public static WebElement Register;
    @FindBy(
            xpath = "//*[@id=\\\"header\\\"]/div[1]/div[2]/div[1]/ul/li[1]/a/span"
    )
    public static WebElement WeeklyAdd;
    @FindBy(
            xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[4]/a/span"
    )
    public static WebElement ReStock;
    @FindBy(
            xpath = "//*[@id=\\\"header\\\"]/div[1]/div[2]/div[1]/ul/li[3]/a/span"
    )
    public static WebElement ClickOnRedCard;
    @FindBy(
            xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[5]/a/span"
    )
    public static WebElement GiftCards;
    @FindBy(
            xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[6]/a/span"
    )
    public static WebElement FindStores;
    @FindBy(
            xpath = "//*[@id=\"secondary\"]"
    )
    public static WebElement Categories;
    @FindBy(
            xpath = "//*[@id=\"secondary\"]"
    )
    public static WebElement Deals;
    @FindBy(
            css = "#cart"
    )
    public static WebElement Cart;
    @FindBy(
            css = "#mainContainer > div:nth-child(2)"
    )
    public static WebElement ViewCart;

    public TargetHomePage() {
    }

    public void clickOnRegisterR() {
        Register.click();
    }

    public void clickOnWeeklyAdd() {
        WeeklyAdd.click();
    }

    public void clickOnRestock() {
        ReStock.click();
    }

    public void clickOnRedCard() {
        ClickOnRedCard.click();
    }

    public void clickOnGiftCards() {
        GiftCards.click();
    }

    public void clickOnFindStores() {
        FindStores.click();
    }

    public void clickOnCategories() {
        Categories.click();
    }

    public void clickOnDeals() {
        Deals.click();
    }

    public void hoverOver() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Cart).perform();
        actions.moveToElement(ViewCart).click().perform();
    }
}
