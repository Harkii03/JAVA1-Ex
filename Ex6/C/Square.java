public class Square extends Shape {
    private int x, y, w;

    public Square(Point p1, int w) {
        this.x = p1.getX();
        this.y = p1.getY();
        this.w = w;

    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void print() {
        super.print();
        System.out.println(
                "(" + x + ", " + y + ")" + "-" + "(" + (x + w) + ", " + y + ")" + "-" + "(" + (x + w) + ", "
                        + (y + w) + ")" + "-" + "(" + x + ", " + (y + w) + ")");
    }

}
