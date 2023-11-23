package by.itacademi.shlesin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    private String buttonAcsessCookie = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    private String buttonSubmitAccountLocator = "/html/body/div[3]/div[2]/div/app-user-account-link/app-profile-link";
    private String getTextEnterLocator = "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span[1]";
    private String inputTextEmailLocator = "/html/body/div[8]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div/input";
    private String inputTextPasswordLocator = "//*[@id=\"3w998ouvqkk-password\"]";
    private String clickfieldEmailLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div";
    private String clickfieldPasswordLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/div";
    private String getErrorMessegeEmtyEmailLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
    private String getErrorMessegeEmtyPasswordLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/app-field-error/app-collapsible";
    private String getErrorMessegeWrongEmailLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
    private WebDriver driver;

    public KvitkiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAcsessCookie() {
        driver.findElement(By.xpath(buttonAcsessCookie)).click();
    }

    public void clickbuttonSubmitAccount() {
        driver.findElement(By.xpath(buttonSubmitAccountLocator)).click();
    }

    public String getTextEnter() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath(getTextEnterLocator)).getText();
    }

    public void clickFieldEmail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(clickfieldEmailLocator)).click();
    }

    public void clickFieldPassword() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(clickfieldPasswordLocator)).click();
    }

    public String getErrorMessegeEmtyEmail() {
        return driver.findElement(By.xpath(getErrorMessegeEmtyEmailLocator)).getText();
    }

    public String getErrorMessegeEmtyPassword() {
        return driver.findElement(By.xpath(getErrorMessegeEmtyPasswordLocator)).getText();
    }

    public void setTextEmail(String email) {
        driver.findElement(By.xpath(inputTextEmailLocator)).sendKeys(email);
    }

    public String getErrorMessegeWrongEmail() {
        return driver.findElement(By.xpath(getErrorMessegeWrongEmailLocator)).getText();
    }
}
