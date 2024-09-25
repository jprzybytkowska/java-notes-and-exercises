public class PetlaFOR {

    public static void main(String[] args) {

// "i" to specjalna zmienna sterująca ktora powie nam kiedy przerwac pętle, przyjelo sie ze jest to i albo j ale nie musi byc ta literka.
// i = 0 bo to wartosc poczatkowa od ktorej startujemy
// i=i+2 to zapis o tym jakie warunki maja zostac dobrane, ze do i dodajemy 2 wiec liczy co 2 do 100.
        for (int i = 0; i < 100;i=i+2) {
            System.out.println(i);
        }
// i =0, i<100 i++ = oznacza, ze zaczynamy od wartosci zero do 100, gdzie mamy inkrementacje i czyli zwiekszamy jej wartosc.
// i%5==0 i tu warunek, ze reszta z dzielenia przez 5 to zero.
        for (int i=0; i<100; i++) {
            if(i%5==0) {
                System.out.println(i);
            }
        }

        for (int sth=0; sth<300; sth++) {
            System.out.println("Bede robil prace domowa");
        }
    }
}
