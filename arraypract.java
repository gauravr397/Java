public class arraypract {
    public static void main(String[] args) {
        int A[] = new int[8];
        int B[] = { 1, 2, 3, 4, 5, 6 };
        B[3] = 23;
        /*
         * for (int i = 0; i <= A.length; i++) {
         * System.out.println(A[i]);
         * }
         */
        int sum = 0;

        /*
         * for (int i = 0; i <= B.length; i++) {
         * sum = sum + B[i];
         * System.out.println(sum);
         * }
         */

        for (int x : B) {
            sum = sum + x;
            System.out.println(sum);
        }

    }

}
