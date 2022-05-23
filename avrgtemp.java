import java.util.*;

public class avrgtemp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of days");
        int days = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= days; i++) {
            System.out.print("enter temp of day" + i + ":");
            int num = sc.nextInt();
            sum += num;
        }
        double avrg = sum / days;
        System.out.println();
        System.out.println("average temp :" + avrg);
    }
}
