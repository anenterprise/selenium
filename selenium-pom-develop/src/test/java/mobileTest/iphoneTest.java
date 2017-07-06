package mobileTest;


import Utility.BaseTest;
import mobilePage.iphonePage;
import org.testng.annotations.Test;

public class iphoneTest extends BaseTest{

    @Test
    public void test(){

        iphonePage ipage=new iphonePage();
        ipage.navigateTo(driver);
        ipage.searchProduct(driver);
        ipage.selectPhone(driver);
        ipage.numberOfQuantity(driver);
        ipage.addToBasket(driver);
        ipage.proceedToCheckout(driver);
        ipage.enterExistingEmailAndPassword(driver);
        ipage.clickSingIn(driver);
        ipage.selectFirstAddress(driver);
        ipage.selectFirstAddress(driver);

    }


}
