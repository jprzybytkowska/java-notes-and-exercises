public class AutoTEST {

    public static void main(String[] args) {

        Auto auto = new Auto();

        System.out.println(auto.marka);
        System.out.println(auto.model);
        System.out.println(auto.rok);
        System.out.println(auto.przebieg);

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info();

    }
}
