package JavaExamples;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1;
        do {
            System.out.println("The value of i is: " + i);
            i++;
        } while (i <= 10) ;

//        int x = 3 ;
//        do {
//            System.out.println("This statement always be printed");
//        } while (x > 4);
    }
}
