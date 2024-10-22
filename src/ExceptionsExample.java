import Drivers.ChromeDriver;
import Drivers.FirefoxDriver;
import Drivers.WebDriver;

public class ExceptionsExample {

    public static void main(String[] args) {

//        int [] numbers = new int[2];
//        numbers[0] = 1;
//        numbers[1] = 3;
//
//        for (int i=0; i <= numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

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
        return null;
    }
}
