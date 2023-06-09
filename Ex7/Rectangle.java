public class Rectangle extends Point {
    private Point p1, p3;

    public Rectangle(Point p1, Point p3) {
        // just describe super() in order to invoke Point class's constructtor
        super(p1.getX(), p1.getY());
        this.p1 = p1;
        this.p3 = p3;
    }

    public int getArea() {
        // abs function <- return "Absolute value"
        return Math.abs(p1.getX() - p3.getX()) * Math.abs(p1.getY() - p3.getY());
    }

    public boolean isSmallerThan(Relatable other) {
        // cast from Relatabe to Point in order to compare each Area
        Rectangle otherRectangle = (Rectangle) other;
        if (this.getArea() < otherRectangle.getArea())
            return true;
        else
            return false;
    }
}
