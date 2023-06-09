public class Queue implements OpenList {
    private int[] data;
    private int head;
    private int tail;

    public Queue() {
        data = new int[100];
        head = 0;
        tail = 0;
    }

    @Override
    public void push(int x) {
        data[head++] = x;
    }

    @Override
    public int pop() {
        return data[tail++];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }
}