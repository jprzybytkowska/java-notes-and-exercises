package Drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {

        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver thirdFirefox = new FirefoxDriver();


        WebDriver safari = new WebDriver() {
            @Override
            public void get(String url) {
                System.out.println("Opening page with safari");

            }

            @Override
            public void get() {

            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Safari");
            }
        };

        safari.get();
        safari.findElementBy();
    }
}
