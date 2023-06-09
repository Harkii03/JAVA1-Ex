public class SimpleNode {

    private int data;
    private SimpleNode next;
    private SimpleNode prev;

    SimpleNode() {
        init();
    }

    void init() {
        this.data = 0; // 0 is a sentinel value
        next = null;
        prev = null;

    }

    void setNext(SimpleNode n) {
        next = n;
    }

    void setPrev(SimpleNode n) {
        prev = n;
    }

    SimpleNode getNext() {
        return next;
    }

    SimpleNode getPrev() {
        return prev;
    }

    int getKey() {
        return data;
    }

    void setKey(int key) {
        this.data = key;
    }
}