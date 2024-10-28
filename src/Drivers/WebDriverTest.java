package Drivers;

public class WebDriverTest {

    public static void main(String[] args) {

        WebDriver driver = getDriver(DriverType.FIREFOX);
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

    }

    private static WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.getPath());
            return new ChromeDriver();
        }
            System.out.println(type.getPath());
            return new FirefoxDriver();

    }
}