import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable{

    // repeatedly output Hello and then sleep for 100 milliseconds.
    @Override
    public void run() {
        while (true){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("interrupted");  //break out of the loop after outputting interrupted
                return;
                //e.printStackTrace();
            }
        }
    }
}
