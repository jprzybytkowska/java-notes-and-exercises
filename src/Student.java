public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String uczelniainfo = "AGH";

    public void przedstawSie() {
        System.out.println("Mam na imię " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje się nickiem " + nick);
    }

    public void podajNrIndeksu() {
        System.out.println("Mój numer indeksu to " + numerIndeksu);
    }

    public void  podajEmail() {
        System.out.println("Mój e-mail to " + email);
    }

    public static void  uczelniainfo() { System.out.println("Moja uczelnia to " + uczelniainfo);
    druga();
    }

    public static void druga() {
        System.out.println("Druga metioda");
    }
}
