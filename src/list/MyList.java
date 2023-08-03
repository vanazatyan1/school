package list;

import java.util.Arrays;

public class MyList {

    public MyList() {
    }

    public int size = 0;
    private String[] items = new String[5];

    public void add(String value) {
        if (size == items.length) {
            this.items = Arrays.copyOf(this.items, 2 * this.size);
        }
        this.items[this.size] = value;
        this.size++;
        this.items = Arrays.copyOf(this.items,  this.size);
    }

    public void remove(int index) {
        this.items[index] = null;
        for (int i = 0; i < this.size; i++) {
            if (this.items[i] == null && i + 1 < items.length) {
                this.items[i] = this.items[i + 1];
                this.items[i + 1] = null;
            }
        }
        this.size--;
        this.items = Arrays.copyOf(this.items,  this.size);
    }

//    public void remove(String item) {
//        item = null;
//        for (int i = 0; i < this.size; i++) {
//            this.items[i] = this.items[i + 1];
//            this.items[i + 1] = null;
//        }
//        this.size--;
//    }

    public String get(int index) {
        return this.items[index];
    }

    public boolean contains(String value) {
        boolean contains = false;
        for (int i = 0; i < this.size; i++) {
            if (this.items[i].equals(value)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public boolean containsAll(MyList containsList) {
        boolean check = true;
        for (int i = 0; i < containsList.size; i++) {
            if (!contains(containsList.get(i))) {
                check = false;
                break;
            }
        }
        return check;
    }

    public void addAll(MyList containsList) {
        for (int i = 0; i < containsList.size; i++) {
            this.add(containsList.get(i));
        }
    }

    public void reset() {
        this.deleteAll();
        this.items = new String[5];
        this.size = 0;
        this.items = Arrays.copyOf(this.items,  this.size);

    }

    public void deleteAll() {
        while (this.size != 0) {
            this.remove(0);
        }
    }

    public void removeAll() {
        for (int i = 0; i < this.size; i++) {
            this.remove(i);
        }
    }

    public boolean ecual(MyList containsList) {
        boolean checkResult = true;
        for (int i = 0; i < this.size; i++) {
            if (!containsList.get(i).equals(this.get(i))) {
                checkResult = false;
                break;
            }
        }
        return checkResult;
    }

    @Override
    public String toString() {
        return "Size is: " + this.size + ", Content " + Arrays.toString(Arrays.stream(this.items)
                .toArray());
    }

}
