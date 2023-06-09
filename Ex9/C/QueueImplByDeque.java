class QueueImplByDeque implements Queue {
    private Deque deque;

    QueueImplByDeque() {
        this.deque = new DequeImplByDLL();
    }

    @Override
    public void enqueue(int key) {
        deque.insertBack(key);
    }

    @Override
    public int dequeue() {
        int x = deque.front();
        deque.removeFront();
        return x;
    }

    @Override
    public int front() {
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