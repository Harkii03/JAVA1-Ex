import java.util.Scanner;

public class Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String s = sc.nextLine();

        String ring = p + p;

        if (ring.contains(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
