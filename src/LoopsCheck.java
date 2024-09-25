//Wypisz liczby z zakresu 1-100 podzielne przez 3
//odwroc elementy tablicy [1,3,5] -> [5,3,1]
public class LoopsCheck {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        int[] numbers = new int[] {1,3,5};

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);

        }
    }
}
