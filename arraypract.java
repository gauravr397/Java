import java.util.*;

public class arraypract {
    public static void main(String[] args) {
        int A[] = new int[8];
        int B[] = { 1, 2, 3, 4, 5, 6, 23, 43, 5, 42, 66, 34 };
        // B[3] = 23;
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

        /*
         * for (int x : B) {
         * sum = sum + x;
         * System.out.println(sum);
         * }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a key");
        int key = sc.nextInt();
        for (int i = 0; i <= B.length; i++) {
            if (key == B[i]) {
                System.out.println("entered key found at " + i);
                System.exit(0);
            }
        }
        System.out.println("not found");

    }

}
