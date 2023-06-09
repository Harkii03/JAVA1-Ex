public class Rectangle extends Shape {
    private int x, y, x2, y2;

    public Rectangle(Point p1, Point p2) {
        this.x = p1.getX();
        this.y = p1.getY();
        this.x2 = p2.getX();
        this.y2 = p2.getY();
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        x2 += dx;
        y2 += dy;
    }

    public void print() {
        super.print();
        System.out.println("(" + x + ", " + y + ")" + "-" + "(" + x2 + ", " + y + ")" + "-" + "(" + x2 + ", " + y2 + ")"
                + "-" + "(" + x + ", " + y2 + ")");
    }

}
