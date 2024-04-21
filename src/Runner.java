import java.io.File;
import java.io.IOException;

public class Runner implements Runnable {
    private int nameThread;
    private int seconds;

    public Runner(int numThread, int seconds) {
        this.nameThread = numThread;
        if (this.seconds > 0) {
            this.seconds = seconds;
        }
        this.seconds = 1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            File file = new File("C:\\temp\\THREAD_" + this.nameThread + "_TESTE_" + i + ".txt");
            try {
                file.createNewFile();
                System.out.println("Criado o arquivo " + file.getName() + " da thread " + this.nameThread);
                Thread.sleep(this.seconds * 1000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
