
public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 1, 5, 2, 11, 10, 6, 0 };
        array = Algorithm.selectAlgorithm(array);
        for (int each : array) {
            System.out.println(each);
        }
    }
}
