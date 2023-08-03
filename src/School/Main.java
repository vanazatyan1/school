package School;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student(15, "Gagulik", 01));
        persons.add(new Student(16, "Vardanik", 02));
        persons.add(new Teacher(46, "Simonyan", "Physics"));
        persons.add(new Teacher(35, "Sargsyan", "Mathematics"));
        for(int i = 0; i < persons.size(); i ++){
            System.out.println("-----------------");
            persons.get(i).displayInfo();

        }
    }


}
