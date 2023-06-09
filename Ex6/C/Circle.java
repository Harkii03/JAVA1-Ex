public class Circle extends Shape {
    private int x, y, r;

    public Circle(Point p1, int r) {
        this.x = p1.getX();
        this.y = p1.getY();
        this.r = r;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void print() {
        super.print();
        System.out.println("(" + x + ", " + y + ") radius = " + r);
    }

}
