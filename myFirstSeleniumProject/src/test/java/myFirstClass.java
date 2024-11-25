import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String googleSource = driver.getPageSource();
        System.out.println(googleSource);

        String googleTitle = driver.getTitle();
        System.out.println("Goggle title is: " + googleTitle);

        driver.get("https://www.udemy.com");
        String udemyTitle = driver.getTitle();
        System.out.println("Udemy title is: " + udemyTitle);

        driver.navigate().back();
        driver.getCurrentUrl();
        String googleurl = driver.getCurrentUrl();
        System.out.println("Google url is:" + googleurl);

        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.getCurrentUrl();
        String udemyurl = driver.getCurrentUrl();
        System.out.println("Udemy url is:" + udemyurl);
 driver.quit();
}
}
