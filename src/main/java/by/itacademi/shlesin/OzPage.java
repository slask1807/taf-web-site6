package by.itacademi.shlesin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzPage {
    public String buttonSubmitAccountLocator = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]/a/span[2]";
    public String buttonEnterWithEmailLocator = "//*[@id=\"loginFormLoginEmailLink\"]";
    public String inputEmailLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
    public String butoonEnterLocator = "//*[@id=\"loginForm\"]/button";
    public String errorMessengeLocator = "//*[@id=\"test\"]/div/div";
    public String wordEnterLocator = "//*[@id=\"loginPopupIntro\"]";
    WebDriver driver;

    public OzPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(buttonSubmitAccountLocator)).click();
    }

    public void clickTabLinkEmail() {
        driver.findElement(By.xpath(buttonEnterWithEmailLocator)).click();
    }

    public void sendKeysInputEmail(String newEmail) {
        driver.findElement(By.xpath(inputEmailLocator)).sendKeys(newEmail);

    }

    public void clickButtonEnter() {
        driver.findElement(By.xpath(butoonEnterLocator)).click();
    }


    public String getTextEnter() {
        return  driver.findElement(By.xpath(errorMessengeLocator)).getText();
    }

    public String getWordEnter (){
        return driver.findElement(By.xpath(wordEnterLocator)).getText();
    }
}
