import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {


    public static void main(String[] args)  {
        try {
            System.out.println("przed odczytaniem");
            readFile("/Users/justynaprzybytkowska/IdeaProjects/java-notes-and-exercises/src/test.txt");
            System.out.println("zamakniecie pliku");
        } catch (FileNotFoundException e) {
            System.out.println("wyrzucony wyjatek");

        } finally {
            System.out.println("zamakniecie pliku");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
