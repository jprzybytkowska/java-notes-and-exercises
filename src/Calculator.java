import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = input.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = input.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber%secondNumber;

        System.out.println("Wynik dodawania:" + addition);
        System.out.println("Wynik odejmowania:" + subtraction);
        System.out.println("Wynik mnożenia:" + multiplication);
        System.out.println("Wynik dzielenia:" + division);
        System.out.println("Wynik z reszty z dzielenia:" + mod);

    }
}
