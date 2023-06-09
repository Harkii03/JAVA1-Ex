import java.io.*;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        // initializa input and output stream
        BufferedInputStream fin = null;
        BufferedOutputStream fout = null;
        int array[] = new int[10000]; // 10000 is temporary size

        try {
            fin = new BufferedInputStream(new FileInputStream("input.txt"));
            fout = new BufferedOutputStream(new FileOutputStream("output.txt"));
            int i;
            int cnt = 0;
            while ((i = fin.read()) != -1) {
                array[cnt++] = i;

            }

            // Write to output file from last to first
            for (int j = cnt - 1; j >= 0; j--) {
                fout.write(array[j]);
            }

        } catch (IOException e) {
        } finally {
            if (fin != null) {
                fin.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }

}
