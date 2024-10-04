public class Footballer extends Person {

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }

    public String footballClub;

    public void playFootball() {
        System.out.println("I am playing football for " + footballClub);
    }
}
