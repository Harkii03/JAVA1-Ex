class StackImplByDeque implements Stack {
    private Deque deque;

    StackImplByDeque() {
        this.deque = new DequeImplByDLL();
    }

    @Override
    public void push(int x) {
        deque.insertFront(x);
    }

    @Override
    public int pop() {
        int x = deque.front();
        deque.removeFront();
        return x;
    }

    @Override
    public int top() {
        return deque.front();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean empty() {
        return deque.empty();
    }
}