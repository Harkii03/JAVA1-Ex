public class Stack {
    static int[] Arrays = new int[255];
    static int top = -1;

    Stack() {
        int[] Arrays;
        int top = -1;
    }

    int pop() {
        int x = Arrays[top];
        top--;
        return x;
    }

    void push(int newvalue) {
        top++;
        Arrays[top] = newvalue;
    }

}
