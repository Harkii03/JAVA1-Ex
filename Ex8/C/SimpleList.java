class SimpleList implements Aggregate {
    private SimpleNode nil;

    SimpleList() {
        init();
    }

    void init() {
        nil = new SimpleNode(0);
        nil.setNext(nil);
        nil.setPrev(nil);
    }

    SimpleNode listSearch(int key) {
        SimpleNode cur = nil.getNext();
        while (cur != nil && cur.getKey() != key) {
            cur = cur.getNext();
        }
        return cur;
    }

    void printList() {
        SimpleNode cur = nil.getNext();
        while (cur != nil) {
            System.out.print(cur.getKey() + " ");
            cur = cur.getNext();
        }
        System.out.println();

    }

    void insert(int key) {
        SimpleNode node = new SimpleNode(key);
        node.setNext(nil.getNext());
        nil.getNext().setPrev(node);
        nil.setNext(node);
        node.setPrev(nil);
    }

    void delete(int key) {
        // Search node corresponding to element that key
        SimpleNode node = listSearch(key);
        if (node != nil) {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
    }

    SimpleNode getNil() {
        return nil;
    }

    public Iterator forwardIterator() {
        return new SimpleListForwardIterator(this);
    }

    public Iterator backwardIterator() {
        return new SimpleListBackwardIterator(this);
    }
}