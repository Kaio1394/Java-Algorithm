import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 1, 5, 2, 11, 10, 6, 7 };
        Arrays.sort(array);
        int index = Algorithm.binarySearch(array, 5);
        System.out.println(index);
    }
}
