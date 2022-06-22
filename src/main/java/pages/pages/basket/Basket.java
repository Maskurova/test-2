package pages.pages.basket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.pages.telecomunications.MobilePhoneReplenishmentPage;


public class Basket extends BasePage {

    private final By buttonAdd = By.xpath("//button[@name ='add-to-cart-sauce-labs-backpack']");
    private final By buttonAddBolt = By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']");
    private final By buttonAddLabs = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
    private final By buttonAddBike = By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']");
    private final By buttonAddFleece = By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']");
    private final By buttonAddShirt = By.xpath("//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']");
    private final By buttonBasket = By.xpath("//a[@class ='shopping_cart_link']");
    private final By buttonCheckout = By.xpath("//button[@data-test = 'checkout']");
    private final By inputFirstname = By.xpath("//input[@placeholder = 'First Name']");
    private final By inputSecondname = By.xpath("//input[@data-test = 'lastName']");
    private final By inputPostalcode = By.xpath("//input[@data-test = 'postalCode']");
    private final By buttonContinue = By.xpath("//input[@data-test = 'continue']");
    private final By buttonFinish = By.xpath("//button[@data-test = 'finish']");
    private final By buttonBackhome = By.xpath("//button[@data-test = 'back-to-products']");

    public Basket(WebDriver driver) {
        super(driver);
    }



    public Basket enterAdd() {
        driver.findElement(buttonAdd).click();
        return this;
    }



    public Basket enterAddBolt() {
        driver.findElement(buttonAddBolt).click();
        return this;
    }

    public Basket enterAddLabs() {
        driver.findElement(buttonAddLabs).click();
        return this;
    }

    public Basket enterAddBike() {
        driver.findElement(buttonAddBike).click();
        return this;
    }

    public Basket enterAddFleece() {
        driver.findElement(buttonAddFleece).click();
        return this;
    }

    public Basket enterAddShirt() {
        driver.findElement(buttonAddShirt).click();
        return this;
    }





    public Basket enterBasket() {
        driver.findElement(buttonBasket).click();
        return this;
    }

    public Basket enterCheckout() {
        driver.findElement(buttonCheckout).click();
        return this;
    }

    public Basket enterFirstname() {
        driver.findElement(inputFirstname).sendKeys("Galya");
        return this;
    }

    public Basket enterSecondname() {
        driver.findElement(inputSecondname).sendKeys("Sidorova");
        return this;
    }

    public Basket enterPostalcode() {
        driver.findElement(inputPostalcode).sendKeys("115230");
        return this;
    }

    public Basket enterContinue() {
        driver.findElement(buttonContinue).click();
        return this;
    }

    public Basket enterFinish() {
        driver.findElement(buttonFinish).click();
        return this;
    }

    public Basket enterBackhome() {
        driver.findElement(buttonBackhome).click();
        return this;
    }


}
