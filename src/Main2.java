import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        int[] list = new int[]{1, 23, 23};
        printList(list);
        list = insert("5 8", list);
        printList(list);
        list = delete("3", list);
        printList(list);
        list = delete("3", list);
        printList(list);


        List list2 = new ArrayList();


    }

    private static void printList(int[] list) {
        System.out.println( Arrays.toString(list));
        System.out.println("____________________________");
    }

    private static int[] getInitialList(String[] lines) {
        int listSize = Integer.parseInt(lines[0]); // 0rd andamy sarqument stringic int
        int[] list = new int[listSize]; // haytarararummenq array listi chapov
        String[] listInStrings = lines[1].split(" "); // 2 toghi strigy split enq anumm yst bacatneri

        for (int i = 0; i < listSize; i++) { // 2 toghi arrayi chapove loop enq frum
            list[i] = Integer.parseInt(listInStrings[i]); // listi ird
        }
        return list;
    }

    private static int[] insert(String valueString, int[] list) { //max index is 4 size is 5
        int[] grownList = list;
        String[] valueSplit = valueString.split(" ");
        int index = Integer.parseInt(valueSplit[0]);
        int value = Integer.parseInt(valueSplit[1]);

        if (index >= list.length) {
            grownList = new int[index + 1];
        }

        System.arraycopy(list, 0, grownList, 0, list.length);

        grownList[index] = value;
        return grownList;
    }

    private static int[] delete(String indexS, int[] list) {
        int index = Integer.parseInt(indexS);
        int[] shortList = new int[list.length - 1];

        for (int i = 0; i < shortList.length; i++) {
            if (i >= index) {
                shortList[i] = list[i + 1];
            } else {
                shortList[i] = list[i];
            }
        }

        return shortList;
    }

}

