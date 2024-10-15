public class Teacher extends Person {

    public String school;

    public Teacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Teacher");
        this.school = school;
    }

    public void walk() {
        System.out.println("I walk very fast");
    }

    public void teachMath() {
        System.out.println("I am teaching Math");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
