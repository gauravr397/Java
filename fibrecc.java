public class fibrecc {

    static int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = -1;
        if (n < 0) {
            System.out.println("fiboncci number is not defined");
        }
        System.out.println(fib(n));
    }
}
