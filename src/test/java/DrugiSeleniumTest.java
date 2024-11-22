import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DrugiSeleniumTest {

    @Test
    public void findSeleniumTutorial() {

        //najpierw wywołujemy driver managera dla chrome, zeby dostosowal nam ustawienia dla chroma, loklaizacje plikow itp
        WebDriverManager.chromedriver().setup();
        //potem tworzymy obiekt driver, ktory umozliwi nam otwarcie przegladareki
        WebDriver driver = new ChromeDriver();
        //potem podajemy adres jaki ma pobrac driver
        driver.get("http://seleniumdemo.com/");
        //szukamy na stronie elementu ktory w nazwie zawiera tekst 'shop' i mamy polecenie klikniecia
        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        //jak juz znajdujemy sie w zakladce 'shop' to szukamy kursu java selenium webdriver i go wybieramy
        WebElement seleniumProdukt = driver.findElement(By.xpath("//h2[text()='Java Selenium WebDriver']"));
        //teraz wprowadzamy asercje, weryfikujemy czy zpstal znaleziony ten element
        Assert.assertTrue(seleniumProdukt.isDisplayed());
        //mozna na koniec dac polecenie zamkniecia przegladarki quit ktory pozwala zamknac calkowicie wszystkie okna a close zamknie tylko biezace okno
        driver.quit();






    }
}
