public class Stack {
    private int top;
    private int[] array;

    public Stack(int size) {
        array = new int[size];
        top = -1;
    }

    public void push(int value) throws StackOverflowException {
        if (top == array.length - 1) {
            throw new StackOverflowException("Overflow. " + value + " can not be pushed.");
        }
        array[++top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Underflow. There is no element in the stack.");
        }
        return array[top--];
    }

}
