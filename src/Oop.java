import oop.Car;
import oop.Jeep;
import oop.Opel;

public class Oop {


    public static void main(String[] args) {
        Jeep jeep = new Jeep();
        jeep.drive();
        jeep.printCarProperties();
        jeep.driveOffRoad();
        jeep.toString();
        System.out.println("--------------");
        Opel car2 = new Opel();
        car2.printCarProperties();
        car2.drive();
    }
}