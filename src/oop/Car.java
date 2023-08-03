package oop;

public class Car {

    public Car() {

    }

    public int doorCount;
    public String color;


    public void drive() {
        System.out.println("Driving car...");
    }

    public void printCarProperties() {
        System.out.println("Door count is: " + this.doorCount);
        System.out.println("Color is: " + this.color);
    }

    @Override
    public String toString() {
      return   this.color;
    }

}
