import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = input.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = input.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber, secondNumber);
        int subtraction = calculator.sub(firstNumber, secondNumber);
        int multiplication = calculator.mult(firstNumber, secondNumber);
        int division = calculator.div(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber, secondNumber);

        System.out.println("Wynik dodawania:" + addition);
        System.out.println("Wynik odejmowania:" + subtraction);
        System.out.println("Wynik mnożenia:" + multiplication);
        System.out.println("Wynik dzielenia:" + division);
        System.out.println("Wynik z reszty z dzielenia:" + mod);

    }
}
