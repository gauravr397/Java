import java.util.Scanner;

public class Primerecc {
    static int CheckPrime(int i, int num) {
        if (num == i)
            return 0;
        else if (num % i == 0)
            return 1;
        else {
            return CheckPrime(i + 1, num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N Value:");
        int n = sc.nextInt();
        System.out.print("Prime Number Between 1 to n are: ");
        for (int i = 2; i <= n; i++)
            if (CheckPrime(2, i) == 0)
                System.out.print(i + " ");
    }
}