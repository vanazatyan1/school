import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[] a = new String[]{"23", "32", "4"};
        String[] b = Arrays.copyOf(a, 6);
        System.out.println(Arrays.toString(b));
    }
}

