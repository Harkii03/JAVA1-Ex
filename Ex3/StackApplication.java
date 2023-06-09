import java.util.Scanner;

class StackApplication {
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            if (x < 0)
                break;
            else if (x == 0) {
                int res = st.pop();
                System.out.println(res);
            } else
                st.push(x);
        }

    }
}