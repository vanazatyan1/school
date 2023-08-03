package School;

public class Person {
    public String name;
    public int age;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }


    public void displayInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }


}
