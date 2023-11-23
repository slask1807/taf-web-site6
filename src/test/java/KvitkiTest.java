import by.itacademi.shlesin.KvitkiPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvitkiTest {
    @Test
    public void checkEmptyValue() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.kvitki.by/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickButtonAcsessCookie();
        kvitkiPage.clickbuttonSubmitAccount();
        Assertions.assertEquals("Вход", kvitkiPage.getTextEnter());
        kvitkiPage.clickFieldEmail();
        kvitkiPage.clickFieldPassword();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitkiPage.getErrorMessegeEmtyEmail());
        kvitkiPage.clickFieldEmail();
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitkiPage.getErrorMessegeEmtyPassword());
    }

    @Test
    public void checkFieldEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.kvitki.by/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickButtonAcsessCookie();
        kvitkiPage.clickbuttonSubmitAccount();
        kvitkiPage.clickFieldEmail();
        kvitkiPage.setTextEmail("test");
        kvitkiPage.clickFieldPassword();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitkiPage.getErrorMessegeWrongEmail());
    }
}

