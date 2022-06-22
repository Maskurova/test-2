package tests.basket.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.AuthTestData.PASSWORD;
import static constants.Constant.AuthTestData.USERNAME;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class BasketTest extends BaseTest {
    @Test
    public void checkBasket(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterUsername(USERNAME)
                .enterPassword(PASSWORD)
                .selectButtonLogin();
        basketPage
                .enterAdd()
                .enterAddBolt()
                .enterAddLabs()
                .enterAddBike()
                .enterAddFleece()
                .enterAddShirt()
                .enterBasket()
                .enterCheckout()
                .enterFirstname()
                .enterSecondname()
                .enterPostalcode()
                .enterContinue()
                .enterFinish()
                .enterBackhome();
    }
}
