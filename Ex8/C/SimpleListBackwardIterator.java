public class SimpleListBackwardIterator implements Iterator {
    private SimpleList simpleList;
    private SimpleNode cur;

    public SimpleListBackwardIterator(SimpleList simpleList) {
        this.simpleList = simpleList;
        // initialize cur to the last node of the list
        cur = simpleList.getNil().getPrev();
    }

    public boolean hasNext() {
        // if cur is nil node, it means that there is no more node.
        return cur != simpleList.getNil();
    }

    public Object next() {
        Object target = cur;
        cur = cur.getPrev();
        return target;
    }
}
