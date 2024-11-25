package IfStatement;

import java.util.Scanner;

public class TestingIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are older than 18 years!");
            System.out.println("You can register also using the mobile app");

        } else
            System.out.println("You are not older than 18 years!");

    }
}