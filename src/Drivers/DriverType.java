package Drivers;

public enum DriverType {

    CHROME("chrome", "/src/resources/chromedriver.exe"),
    FIREFOX("firefox", "/src/resources/firefox.exe");

    public final String name;
    private final String path;

    // Prawidłowa definicja konstruktora
    private DriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }

    // Opcjonalnie getter dla nazwy
    public String getName() {
        return name;
    }

    // Opcjonalnie getter dla ścieżki
    public String getPath() {
        return path;
    }
}
