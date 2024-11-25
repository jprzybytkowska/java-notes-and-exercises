import java.util.Scanner;

public class printError {
    public static void main(String[] args) {

        //1. what we know

        int assigment_total = 40;
        int exam_total = 200;
        int assigment_grade;
        int exam_grade;

        //2. user input

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your total assigment grade:");
        assigment_grade = input.nextInt();

        System.out.println("Please enter your final exam grade:");
        exam_grade = input.nextInt();

        //3. Processing

        int student_grade = assigment_grade + exam_grade;
        int total = assigment_total + exam_total;
        float percentage = (float) student_grade / total * 100;

        //4. Print
        System.out.println("Your total Grade is: " + student_grade);
        System.out.println("Your percentage is:" + percentage);

    }
}
