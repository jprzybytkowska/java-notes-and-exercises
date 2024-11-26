import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRows = table.findElements(By.tagName("t r"));
        System.out.println(tableRows.size());
        System.out.println(tableRows.get(0).getText());

        Thread.sleep(6000);
        driver.quit();

    }
}