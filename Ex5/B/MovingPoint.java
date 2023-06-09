public class MovingPoint {

    private int x;
    private int y;
    private int dx;
    private int dy;

    MovingPoint(int NewValue3, int NewValue4) {
        this.x = NewValue3;
        this.y = NewValue4;
    }

    void setVelocity(int newx, int newy) {
        dx = newx;
        dy = newy;
    }

    void move() {
        x += dx;
        y += dy;

    }

    void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    double getDistance(MovingPoint m) {
        double d = Math.sqrt((m.x - x) * (m.x - x) + (m.y - y) * (m.y - y));
        return d;
    }
}
