public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
//
//        int result = metody.pobierzWynik();
//        int result2 = result *2;
//        System.out.println("Rezultat przed mnozeniem to: " + result);
//        System.out.println("Rezultat po mnozeniu to: " + result2);
//        metody.policzWynikParam( 2 );
//        metody.policzWynikParam( 100 );

        int result = metody.add( 2, 6, "Hello");
        System.out.println(metody.add(2,6, "Hello2"));
        System.out.println(result);
    }
}
