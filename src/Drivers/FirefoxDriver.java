package Drivers;

public class FirefoxDriver implements WebDriver {

    @Override
    public void get(String url) {

    }

    @Override
public void get() {
        System.out.println("metoda get firefox");
    }

@Override
public void findElementBy() {
        System.out.println("metoda find by element firefox");
    }
}
