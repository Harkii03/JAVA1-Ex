public class Point {
    private int dx = 0;
    private int dy = 0;

    public Point() {
        dx = 0;
        dy = 0;
    }

    void move(int newValue1, int newValue2) {
        if (dx + newValue1 >= -100 && dx + newValue1 <= 100 &&
                dy + newValue2 >= -100 && dy + newValue2 <= 100) {
            dx += newValue1;
            dy += newValue2;
        }
    }

    void setX(int newValue) {
        dx = newValue;

    }

    void setY(int newValue) {
        dy = newValue;
    }

    int getX() {
        return dx;
    }

    int getY() {
        return dy;
    }

}
