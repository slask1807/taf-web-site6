package by.itacademi.shlesin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassRwByRuPage {
    private String buttonPersonalAccountLocator = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    private String getTextAutorisationLocator = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    private String getErrorMessegeLoginLocator = "//*[@id=\"login-error\"]";
    private String buttonEnterLocator = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    private String inputLoginLocator = "//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
    private String inputPasswordLocator = "//*[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
    private String getTextErrorPasswordMessegeLocator = "//*[@id=\"password-error\"]";
    private String getErrorMassegeThisWrongUsersNameOrPasswordLocator = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";
    private WebDriver driver;

    public PassRwByRuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonPersonalAccount() {
        driver.findElement(By.xpath(buttonPersonalAccountLocator)).click();
    }

    public String getTextAutorisation() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath(getTextAutorisationLocator)).getText();
    }


    public String getTextErrorLoginMessege() {
        return driver.findElement(By.xpath(getErrorMessegeLoginLocator)).getText();
    }

    public String getErrorMessegePassword() {
        return driver.findElement(By.xpath(getTextErrorPasswordMessegeLocator)).getText();
    }

    public String getErrorMessegeNoExisValue() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath(getErrorMassegeThisWrongUsersNameOrPasswordLocator)).getText();
    }

    public void clickButtonEnter() {
        driver.findElement(By.xpath(buttonEnterLocator)).click();
    }

    public void setInputLogin(String email) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(inputLoginLocator)).sendKeys(email);
    }

    public void setInputPassword(String password) {

        driver.findElement(By.xpath(inputPasswordLocator)).sendKeys(password);
    }
}