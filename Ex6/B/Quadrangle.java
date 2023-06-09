class Quadrangle extends Shape {
    protected Point[] P;

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        P = new Point[4];
        P[0] = p1;
        P[1] = p2;
        P[2] = p3;
        P[3] = p4;
    }

    public void print() {
        int i;
        super.print();
        for (i = 0; i < 4; i++)
            if (i < 3)
                System.out.print("(" + P[i].getX() + ", " + P[i].getY() + ")" + "-");
            else
                System.out.println("(" + P[i].getX() + ", " + P[i].getY() + ")");
    }

    public void move(int dx, int dy) {
        for (int i = 0; i < P.length; i++) {
            P[i].move(dx, dy);
        }
    }

}
