import java.io.*;
import java.util.Scanner;

import java.util.*;

class fileatofileb {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source file path from where you have to read/copy :");
        String a = sc.nextLine();
        File x = new File(a);
        System.out.println("Enter the destination file path where you have to write/paste :");
        String b = sc.nextLine();
        File y = new File(b);
        copyContent(x, y);
    }

    public static void copyContent(File a, File b) throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);
        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File copied");
    }
}