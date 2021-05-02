public class Main {
    public static void main(String[] args) {

        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        //After sleeping for 2 seconds, the default main thread should
        //interrupt the background thread
        try {
            Thread.sleep(2000);
            thread.interrupt();
            //System.out.println("interrupted");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
