package JavaExamples;

import java.util.Scanner;

public class MoreThanOneCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 5;
        int y = 7;

        if (x !=4 || y == 3)
            System.out.println("The if condition is met");
        else
            System.out.println("The if condition is not satisfied");
    }
}
