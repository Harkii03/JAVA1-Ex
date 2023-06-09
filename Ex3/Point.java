class Point {

    static int X_MIN = 0;
    static int X_MAX = 0;
    static int Y_MIN = 0;
    static int Y_MAX = 0;
    private int dx = 0;
    private int dy = 0;

    Point() {
        Y_MIN = 0;
        X_MIN = 0;
        X_MAX = 0;
        Y_MAX = 0;
        dx = 0;
        dy = 0;
    }

    void move(int newvalue1, int newvalue2) {
        dx += newvalue1;
        dy += newvalue2;

        if ((dx < X_MIN & dx > X_MAX) | (dy < Y_MIN & dy > Y_MAX)) {
            dx -= newvalue1;
            dx -= newvalue1;
        }
    }

    int getX() {
        return dx;
    }

    int getY() {
        return dy;
    }
}
