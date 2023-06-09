import java.util.Scanner;

public class Gasstand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Queue[] qu = new Queue[255];
        int[] res = new int[255]; // Arrays for storage
        int cnt = 0; // counter variable

        // create n * queue
        for (int i = 0; i < N; i++)
            qu[i] = new Queue();

        for (int i = 0; i < M; i++) {
            int kind = sc.nextInt();
            if (kind == 0) {
                int lane = sc.nextInt() - 1;
                res[cnt++] = qu[lane].dequeue();
            } else {
                int number = sc.nextInt();
                int small_number = 0;
                int queue_size = qu[0].size();

                // dequeue the smallest size queue++
                for (int j = 1; j < N; j++) {
                    if (queue_size > qu[j].size()) {
                        queue_size = qu[j].size();
                        small_number = j;
                    }
                }
                qu[small_number].enqueue(number);
            }
        }
        for (int i = 0; i < cnt; i++)
            System.out.println(res[i]);
    }
}
