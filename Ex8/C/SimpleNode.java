
public class SimpleNode {

    private int key;
    private SimpleNode next;
    private SimpleNode prev;

    SimpleNode(int x) {
        init(x);
    }

    void init(int x) {
        key = x;
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
        return key;
    }

}