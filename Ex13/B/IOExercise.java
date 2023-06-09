import java.io.*;

public class IOExercise {
    public static void main(String[] args) throws IOException {
        // initialize input and output streams
        DataInputStream din = null;
        DataOutputStream dout = null;

        try {
            System.out.println("Enter the number:");
            // Input the number
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // Convert string to double using Double.parseDouble()
            double num = Double.parseDouble(br.readLine());
            // Culcurate sqrt of num
            double s1 = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + s1);

            dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("number.data")));
            dout.writeDouble(s1);
            // flush the output stream
            dout.flush();
            System.out.println("The square root value " + s1 + " is written to the file \"number.data\".");

            // Read from output file
            din = new DataInputStream(new BufferedInputStream(new FileInputStream("number.data")));
            // Read double from file using readDouble()
            double s2 = din.readDouble();
            System.out.println("The value read from the file \"number.data\" is " + s2);
            // calculate square of s2
            double num2 = Math.pow(s2, 2);
            System.out.println("Square of " + s2 + " is " + num2);

        } catch (IOException e) {
        } finally {
            if (din != null) {
                din.close();
            }
            if (dout != null) {
                dout.close();
            }
        }
    }

}