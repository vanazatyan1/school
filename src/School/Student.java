package School;

public class Student extends Person {

    public Long id;

    public Student(int age, String name, long id) {
        super(age, name);
        this.id = id;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(this.id);
    }


}
