public class SortingMachine {

    // bubble sort
    public void sort(Point[] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length - 1; j++) {
                if (!(p[j].isSmallerThan(p[j + 1]))) {
                    Point temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
    }

}
