package JavaExamples;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value between 1&5");
        int grade = scanner.nextInt();

        switch (grade) {
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
            case 3:
                System.out.println("The value is 3");
            case 4:
                System.out.println("The value is 4");
            case 5:
                System.out.println("The value is 5");
        }
    }
}


