

// stworz 3 obiekty klasy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow do tablicy.
//przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody

public class StudentChecker {
    public static void main(String[] args) {

      Student dane = new Student();
      dane.imie = "Jan";
      dane.nazwisko = "Kowalski";
      dane.nick = "jako";
      dane.email = "jako@gmail.com";
      dane.numerIndeksu = 123;

      dane.przedstawSie();
      dane.podajEmail();
      dane.zalogujSie();
      dane.podajNrIndeksu();

        String[] studenci = new String[5];
        studenci[0] = "Jan";
        studenci[1] = "Kowalski";
        studenci[2] = "jako";
        studenci[3] = "jako@gmail.com";
        studenci[4] = "123";

        System.out.println(studenci);
    }
}
