package list;

import java.util.List;

public class TestingMyList {

    public static void main(String[] args) {
        MyList list1 = new MyList();
        list1.add("1");
        list1.add("34");
        list1.add("123");
        list1.add("421");
        list1.add("757");
        list1.add("513");
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
        String a = list1.get(2);
        System.out.println(a);
        boolean b = list1.contains("757");
        boolean c = list1.contains("543");
        System.out.println(b);
        System.out.println(c);
        MyList list2 = new MyList();
        list2.add("34");
        list2.add("123");
        list2.add("513");
        System.out.println(list2);
        boolean d = list1.containsAll(list2);
        System.out.println(d);
        list1.addAll(list2);
        System.out.println(list1);
        list2.deleteAll();
        System.out.println(list2);
        list1.reset();
        System.out.println(list1);
        boolean e  = list2.ecual(list1);
        System.out.println(e);
    }
}
