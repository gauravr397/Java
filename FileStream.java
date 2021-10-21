import java.io.*;

public class FileStream {
    public static void main(String[] args) {
        File file = new File("E:\\java\\Prime.java");
        FileInputStream infile = null;
        try {
            infile = new FileInputStream(file);
            int b;
            while ((b = infile.read()) != -1) {
                System.out.println((char) b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (infile != null)
                    infile.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
