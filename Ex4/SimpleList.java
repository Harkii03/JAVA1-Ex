class SimpleList {
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
        /* your code */
        SimpleNode cur = nil.getNext();
        while (cur != nil && cur.getData() != key) {
            cur = cur.getNext();
        }
        return cur;
    }

    void printList() {
        /* your code */
        SimpleNode cur = nil.getNext();
        while (cur != nil) {
            System.out.print(cur.getData() + " ");
            cur = cur.getNext();
        }
        System.out.println();

    }

    void delete(int key) {
        /* your code */
        // Search node corresponding to element that key
        SimpleNode node = listSearch(key);
        if (node != nil) {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }

    }

    void insert(int key) {
        /* your code */
        SimpleNode node = new SimpleNode(key);
        node.setNext(nil.getNext());
        nil.getNext().setPrev(node);
        nil.setNext(node);
        node.setPrev(nil);
    }
}