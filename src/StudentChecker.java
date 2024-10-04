

// stworz 3 obiekty klasy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow do tablicy.
//przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody

public class StudentChecker {
    public static void main(String[] args) {

      String uczelnia = Student.uczelniainfo;
      Student.uczelniainfo();

      Student adam = new Student();
      adam.imie = "Adam";
      adam.nazwisko = "Adamski";
      adam.numerIndeksu = 123456;
      adam.email = "adama@gmail.com";
      adam.nick = "adama";
      String uczelniaAdama = adam.uczelniainfo;

      Student kasia = new Student();
      kasia.imie = "Kasia";
      kasia.nazwisko = "Kasiaska";
      kasia.numerIndeksu = 123789;
      kasia.email = "kasiak@gmail.com";
      kasia.nick = "kasiak";

      Student piotr = new Student();
      piotr.imie = "Piotr";
      piotr.nazwisko = "Piotrowski";
      piotr.numerIndeksu = 321789;
      piotr.email = "piotrp@gmail.com";
      piotr.nick = "piotrp";

      Student[] students = new Student[3];
      students[0] = adam;
      students[1] = kasia;
      students[2] = piotr;

      for (int i=0; i<students.length; i++) {
        students[i].przedstawSie();
        students[i].podajEmail();
        students[i].podajNrIndeksu();
        students[i].zalogujSie();

      }

    }
}
