package Drivers;

public abstract class WebDriverTest {

    public static void main(String[] args) {

        String name = "Chrome";
        WebDriver driver = getDriver(name);
        assert driver != null;
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("Chrome")) {
            return new ChromeDriver();
        } else if (name.equals("Firefox"))
            return new FirefoxDriver();
    }
    throw new NoValidBrowserName("No valid browser name");

    }