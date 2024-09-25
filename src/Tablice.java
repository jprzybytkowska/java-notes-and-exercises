public class Tablice {

    public static void main(String[] args) {
// String to typ danych (czyli obiektowy), potem imiona to nazwa tablicy, new jako nowa tablica i String[3] oznacza ile bedzie wartosci w tablicy.
        String[] imiona = new String[3];
// rozpoczynamy numerowanie w tablicy od 0 a nie od 1, wiec w nawiasie kwadratowym umieszczamy indeks.
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michał";

       /* System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);*/

// mozemy zdefiniowac dane w tablicy za pomoca nawiasow klamrowych
        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
// potem mozna je wyprintowac ale indeks zaczyna sie od 0 do 5 co daje 6 elementow
        /*System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

// długosc naszej tablicy czyli z ilu elementow sie sklada.
        System.out.println(lottoNumbers.length);*/


// to samo co wyzej robimy petla for:
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }
    }
}
