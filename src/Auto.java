public class Auto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public void jedz() {
        System.out.println("Jedz");
    }
    public void hamuj() {
         System.out.println("Hamuj");
    }

    public void info() {
        System.out.println("Marka " + marka);
        System.out.println("Model " + model);
        System.out.println("Rok " + rok);
        System.out.println("Przebieg " + przebieg);
    }

}