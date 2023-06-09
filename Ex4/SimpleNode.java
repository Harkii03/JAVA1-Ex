public class SimpleNode {

    private int data;
    private SimpleNode next;
    private SimpleNode prev;

    SimpleNode(int x) {
        init(x);
    }

    void init(int x) {
        data = x;
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

    int getData() {
        return data;
    }
}