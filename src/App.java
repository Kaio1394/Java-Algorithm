import java.io.File;
import java.io.IOException;
import java.lang.Thread.State;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Thread> listThreads = new ArrayList<>();
        Thread t1 = new Thread(new Runner(1, 1));

        Thread t2 = new Thread(new Runner(2, 2));
        listThreads.add(t1);
        listThreads.add(t2);
        for (Thread each : listThreads) {
            each.start();
        }
        while (listThreads.stream().allMatch(x -> x.getState() == State.RUNNABLE)) {
            Thread.sleep(1000);
        }
    }
}
