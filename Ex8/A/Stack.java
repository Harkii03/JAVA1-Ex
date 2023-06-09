public class Stack implements OpenList {
    private int[] data;
    private int top;

    public Stack() {
        data = new int[100];
        top = 0;
    }

    @Override
    public void push(int x) {
        data[top++] = x;
    }

    @Override
    public int pop() {
        return data[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}