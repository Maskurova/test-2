package tests.telecomunications.negative;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.AuthTestDataInvalid.PASSWORDINVALID;
import static constants.Constant.AuthTestDataInvalid.USERNAMEINVALID;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class AuthTest extends BaseTest {

    @Test
    public void checkIsRedirectAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterUsernameInvalid(USERNAMEINVALID)
                .enterPasswordInvalid(PASSWORDINVALID)
                .selectButtonLogin();
    }
}
