public class Point {

    private int x;
    private int y;

    Point(int NewValue1, int NewValue2) {
        this.x = NewValue1;
        this.y = NewValue2;
    }

    void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    double getDistance(Point p) {
        double d = Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
        return d;
    }

}
