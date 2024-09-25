import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę A");
        int firstNumber = input.nextInt();
        System.out.println("Podaj drugą liczbę B");
        int secondNumber = input.nextInt();

        boolean result = secondNumber > firstNumber;
        System.out.println(result);
        System.out.println("A > B :" + (firstNumber > secondNumber));
        System.out.println("B > A :" + (secondNumber > firstNumber));
        System.out.println("A >= B :" + (firstNumber >= secondNumber));
        System.out.println("B >= A :" + (secondNumber >= firstNumber));
        System.out.println("B == A :" + (secondNumber == firstNumber));
        System.out.println("B != A :" + (secondNumber != firstNumber));
    }
}
