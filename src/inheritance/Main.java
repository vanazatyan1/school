package inheritance;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Transport car = new Car();
        Transport plain = new Plain();
        car.drive();
        plain.drive();
        System.out.println(plain.getLocation());
    }
}
