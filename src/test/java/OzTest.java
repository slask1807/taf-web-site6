
import by.itacademi.shlesin.OzPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OzTest {
    @Test
    public void testWithoutExistUser() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://oz.by/");
        OzPage ozPage = new OzPage(driver);
        ozPage.clickButtonLogin();
        ozPage.clickTabLinkEmail();
        ozPage.clickButtonEnter();
        Assertions.assertEquals("Введите адрес электронной почты", ozPage.getTextEnter());
        driver.close();
    }

    @Test
    public void testButtonEnter() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://oz.by/");
        OzPage ozPage = new OzPage(driver);
        ozPage.clickButtonLogin();
        Assertions.assertEquals("Вход", ozPage.getWordEnter());
        driver.close();
    }
}
