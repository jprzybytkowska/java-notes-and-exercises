public class PersonTest {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Tom", 29, "University");
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 21, "Boca Juniors");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
