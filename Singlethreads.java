import java.util.Set;

public class Singlethreads {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.setName("qwerty");
        System.out.println(thread.getName() + " running ......");
        int pri = thread.getPriority();
        thread.setPriority(10);
        System.out.println("main thread is : " + thread);
        System.out.println("main thread priority is ... " + pri);
    }

}
