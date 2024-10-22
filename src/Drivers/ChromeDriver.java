package Drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void get(String url) {

    }

    @Override
public void get() {
        System.out.println("metoda get chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("metoda find by element chrome");
    }

}
