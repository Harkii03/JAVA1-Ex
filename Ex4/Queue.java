public class Queue {
    private int[] Arrays = new int[255];
    private int tail = 0;
    private int top = 0;

    Queue() {
        tail = 0;
        top = 0;
    }

    void enqueue(int Newnumber) {
        Arrays[top++] = Newnumber;
    }

    int dequeue() {
        int res = Arrays[tail];
        tail++;
        return res;
    }

    int size() {
        return top - tail;
    }
}
