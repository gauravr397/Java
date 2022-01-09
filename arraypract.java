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

        /*
         * for (int i = 0; i <= B.length; i++) {
         * System.out.println(B[i]);
         * }
         */
        for (int x : B) {
            System.out.println(x);
        }
    }

}
