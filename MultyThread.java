public class MultyThread {
    public static void main(String[] args) {
        Runnable r1 = new ImplRunnable("r1", 1000);
        Thread t1 = new Thread(r1);
        Runnable r2 = new ImplRunnable("r2", 2000);
        Thread t2 = new Thread(r2);
        Runnable r3 = new ImplRunnable("r3", 3000);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}

class ImplRunnable implements Runnable {
    String name;
    int time;

    public ImplRunnable(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread interrupt exception");
        }
        System.out.println("The name is: " + name + " ,Thread dormancy: " + time + " Millisecond");
    }
}