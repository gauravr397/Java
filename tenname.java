import java.io.*;

public class tenname {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String name = "xyz";
        int i = 0;
        try {
            while (i < 10) {
                System.out.println("Enter name: ");
                name = br.readLine();
                System.out.println("Name entered is: " + name);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Some error occurred");
        }

        br.close();
        r.close();
    }
}