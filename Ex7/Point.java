public class Point implements Relatable {
    private int x, y;

    Point(int newx, int newy) {
        this.x = newx;
        this.y = newy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void print() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    // judge whether this point is smaller than the other point
    public boolean isSmallerThan(Relatable other) {
        // cast from Relatabe to Point in order to compare x value and y value
        Point otherPoint = (Point) other;
        // Judge whether true or false
        if (this.x < otherPoint.x)
            return true;
        else if (this.x == otherPoint.x && this.y < otherPoint.y)
            return true;
        else
            return false;
    }

}
