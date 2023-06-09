public class Parallelogram extends Shape {
    private int x, y, x2, y2, w;

    public Parallelogram(Point p1, Point p2, int w) {
        this.x = p1.getX();
        this.y = p1.getY();
        this.x2 = p2.getX();
        this.y2 = p2.getY();
        this.w = w;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void print() {
        super.print();
        System.out.println("(" + x + ", " + y + ")" + "-" + "(" + (x + w) + ", " + y + ")" + "-" + "(" + (x2 + w) + ", "
                + (y2 + w) + ")" + "-" + "(" + x2 + ", " + (y2 + w) + ")");
    }

}
