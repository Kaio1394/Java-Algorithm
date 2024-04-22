public class StudyThreads {
    private int count = 0;

    // (synchronized) - Wait thread use increment(), while thread its using this
    // method, other thread
    // must wait
    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws Exception {
        StudyThreads app = new StudyThreads();
        app.doWork();
    }

    public void doWork() {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }

        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(count);
    }
}
