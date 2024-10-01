//Wypisz liczby z zakresu 1-100 podzielne przez 3
//odwroc elementy tablicy [1,3,5,7,0] -> [0,7,5,3,1]
public class LoopsCheck {
    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        int[] numbers = new int[]{1, 3, 5, 7, 0};
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(numbers[i]);
//
////        int[] numbers = new int[] {1,3,5};
//            for (int j = numbers.length - 1; j >= 0; j--) {
//                System.out.println(numbers[j]);
//


    int [] numbers = new int[] {1, 3, 5, 7, 0};

    for (int i=0; i<(numbers.length/2); i++) {
        int temp = numbers[i]; // zmienna tymczasowa, ktora bedzie przechowywala wartosc i=0 czyli nasza 1, i =1 czyli nasza 3, i=2 czyli nasza 5
        numbers[i] = numbers[numbers.length-1-i]; // czwarty ineks czyli 0
        numbers[numbers.length-1-i] = temp; // wartosc temp to 1 //numbers[3] = 3
        System.out.println("Iteracja numer" + i);
    }
    for (int i=0; i<numbers.length; i++) {
        System.out.println(numbers[i]);
    }

            }
        }
