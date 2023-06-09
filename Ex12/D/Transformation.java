import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // convert to StringBuilder(mutable object) from String(immutable object)
        StringBuilder str = new StringBuilder(s);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String command = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (command.equals("print")) {
                System.out.println(str.substring(a, b + 1));
            } else if (command.equals("reverse")) {
                // reverse the str from a to b
                for (int j = 0; j < (b - a + 1) / 2; j++) {
                    char temp = str.charAt(a + j);
                    str.setCharAt(a + j, str.charAt(b - j));
                    str.setCharAt(b - j, temp);
                }
            } else if (command.equals("replace")) {
                String temp_str = sc.next();
                str.replace(a, b + 1, temp_str);

            }
        }
    }
}