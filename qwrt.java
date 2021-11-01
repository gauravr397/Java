public class qwrt {
    void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            int c = a / b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        qwrt t = new qwrt();
        try {
            t.div(20, 0);
        } catch (Exception e) {
            System.out.println("b is zero");
        } finally {
            System.out.println("final block.");
        }

    }
}
