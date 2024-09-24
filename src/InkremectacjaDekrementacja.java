public class InkremectacjaDekrementacja {

    public static void main(String[] args) {

    int a = 0;
    System.out.println("Wartość a: " + a); //0
    int b = a++;
    System.out.println("Wartość b: " + b); //0 -> w post inkrementacji najpierw wrzucamy wynik dla a czyli zero, a dopiero pozniej dodajemy 1. Dlatego jak wartosc a = 0, to gdy mamay a++, to tworzymy nowa zmienna b o wartosci pierwotnej a, a dopiero potem dodajemy 1 i a juz jest 1.
    System.out.println("Wartość a: " + a); //1
    int c = ++a;
    System.out.println("Wartość c: " + c); //2 -> w pre inkrementacji wrzucamy od razy wynik wart a + 1. i zapisujemy, ze mamy od razu 2 dla a i 2 dla c.
    System.out.println("Wartość a: " + a);//2

        int d = 0;
        System.out.println("Wartość d: " + d);// 0
        int e = d--;
        System.out.println("Wartość e: " + e);//0
        System.out.println("Wartość d: " + d);//-1
        int f = --d;
        System.out.println("Wartość f: " + f);//-2
        System.out.println("Wartość d: " + d);//-2
}
}
