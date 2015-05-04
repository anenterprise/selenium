package mobilePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class iphonePage {
    public WebDriver driver;

    public void navigateTo(WebDriver driver){

        driver.get("https://www.amazon.co.uk");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

    }

    public void searchProduct(WebDriver driver){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.cssSelector("#issDiv3 > span.s-heavy")).click();
    }
    public void selectPhone(WebDriver driver){
        explicitWait(driver, By.xpath(".//*[@id='result_0']//*/img"));
        driver.findElement(By.xpath(".//*[@id='result_0']//*/img")).click();
    }

    public void numberOfQuantity(WebDriver driver){
        explicitWait(driver,By.id("quantity"));
        Select select=new Select(driver.findElement(By.id("quantity")));
        select.selectByValue("3");
    }

    public void addToBasket(WebDriver driver){
        driver.findElement(By.id("bb_atc_button")).click();
    }

    public void proceedToCheckout(WebDriver driver){
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
    }

    public void enterExistingEmailAndPassword(WebDriver driver){
        explicitWait(driver,By.id("ap_email"));
        driver.findElement(By.id("ap_email")).sendKeys("seleniumuser@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("welcome");

    }

    public void clickSingIn(WebDriver driver){
        driver.findElement(By.id("signInSubmit-input")).click();
    }

    public void selectFirstAddress(WebDriver driver){
        explicitWait(driver,By.xpath("//*[@id='address-book-entry-0']/div[2]/span/a"));
        driver.findElement(By.xpath("//*[@id='address-book-entry-0']/div[2]/span/a")).click();
    }
    public void explicitWait(WebDriver driver,By by){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
