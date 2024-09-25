import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj swój wiek");
        int age = input.nextInt();
        if (age > 18) {
            System.out.println("Dziękuje za zakupy!");
        } else if (age < 18 && age >=0) {
            System.out.println("Nie możesz kupić alkoholu");
        } else {
            System.out.println("Miło Cię widzieć");
        }
    }
}
