public class Point {

    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public double getDistance(Point p) {
        double d = Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
        return d;
    }
}
