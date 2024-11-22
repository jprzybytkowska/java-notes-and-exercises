import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PierwszySeleniumTest {

    @Test
    public void openGooglePage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //przechodzimy do okienka z plikami cookies
        //driver.switchTo().frame(0);

        //znajduje przycisk
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Accept all']"));

        //klikniecie przycisku akceptacji plikow cookies
        agreeButton.click();

        //powrót do pierwotnego okna
        driver.switchTo().defaultContent();

        //znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));

        //wprowadz wartosc "selenium" do pola wyszukiwania
        searchField.sendKeys("Selenium");

        //zasymuluj nacisniecie przycisku ENTER
        searchField.sendKeys(Keys.ENTER);

        //sprawdzenie czy mamy odpowiedni rezultat czyli link selenium.dev
        WebElement result;
        result = driver.findElement(By.xpath("//a[contains(@href='selenium.dev')]"));

        //asercje - specjalne metody sprawdzajace
        Assert.assertTrue(result.isDisplayed());

        driver.quit();

    }
}
