import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //przechodzimy do okienka z plikami cookies
        //driver.switchTo().frame(0);

        //znajduje przycisk
        WebElement agreeButton = driver.findElement(By.xpath("//button[.='Accept all']"));

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
        WebElement result = driver.findElement(By.xpath("//a[contains(@href='selenium.dev')]"));

        //asercje - specjalne metody sprawdzajace
        Assert.assertTrue(result.isDisplayed());

    }

    public WebDriver getDriver(String browser) {

        switch (browser) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            default:
                throw new InvalidArgumentException("Invalid browser name");
        }
    }
}