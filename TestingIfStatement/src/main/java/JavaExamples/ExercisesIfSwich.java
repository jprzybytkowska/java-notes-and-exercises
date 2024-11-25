package JavaExamples;

import java.util.Scanner;

public class ExercisesIfSwich {
    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your operation: 1-for addition, 2-for substraction, 3=for multiplication");
        int choice = input.nextInt();

        if (choice == 1)
            System.out.println("The additional is:" + (x + y));
        else if (choice == 2)
            System.out.println("The substraction is:" + (x - y));
        else if (choice == 3)
            System.out.println("The multiplication is:" + (x * y));
        else
            System.out.println("Invalid choice");


    }
}