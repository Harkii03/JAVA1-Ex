public class MovingPoint extends Point {

    protected int dx;
    protected int dy;

    public MovingPoint(int x, int y) {
        super(x, y);
    }

    public void setVelocity(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void move() {
        x += dx;
        y += dy;
    }

}
