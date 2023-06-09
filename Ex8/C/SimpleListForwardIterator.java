public class SimpleListForwardIterator implements Iterator {
    private SimpleList simpleList;
    private SimpleNode cur;

    public SimpleListForwardIterator(SimpleList simpleList) {
        this.simpleList = simpleList;
        // initialize cur to the first node of the list
        cur = simpleList.getNil().getNext();
    }

    public boolean hasNext() {
        // if cur is nil node, it means that there is no more node.
        return cur != simpleList.getNil();
    }

    public Object next() {
        Object target = cur;
        cur = cur.getNext();
        return target;
    }
}