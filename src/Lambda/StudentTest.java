package Lambda;

public class StudentTest {

    public static void main(String[] args) {

        Student it = new ItStudent();
        sayHello("John", it, 23);



    Student med = new Student() {
        @Override
        public void sayHello(String name, int age) {
            System.out.println("I will be a doctor");
            System.out.println("My name is " + name + "I am" + age);
        }
    };

    sayHello("John",med, 29);

    //lambda zapis: (parametr) -> System.out.println("I am not student, my name is" + imie);

Student noStudent = (name, age) -> {
    System.out.println("I am not student, my name is " + name);
    if(age>18) {
        System.out.println("You can buy a beer");
    }
};

sayHello("Tom", noStudent, 22);

}
    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name, age);

    }
}
