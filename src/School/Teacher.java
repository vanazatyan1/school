package School;

import javax.swing.plaf.PanelUI;

public class Teacher extends Person{
    String subject;

    public Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(this.subject);

    }
}
