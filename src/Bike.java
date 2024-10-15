public class Bike implements Vehicle {

@Override
    public void jazda(int speed) {
    System.out.println("Jade rowerem z predkoscia");

}
@Override
    public void stop() {
    System.out.println("Hamuje rowerm");
}

@Override
    public String info() {
    return "Rower"
}

}
