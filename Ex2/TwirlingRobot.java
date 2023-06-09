import javax.swing.text.AbstractDocument.BranchElement;

public class TwirlingRobot {

    private int x = 0;
    private int y = 0;
    private int d = 0;

    TwirlingRobot() {
        x = 0;
        y = 0;
        d = 0;
    }

    void initialize(int newvalue1, int newvalue2, int newvalue3) {
        x = newvalue1;
        y = newvalue2;
        d = newvalue3;
    }

    void move() {

        switch (d) {
            case 0:
                y -= 1;
                break;
            case 1:
                x += 1;
                break;
            case 2:
                y += 1;
                break;
            case 3:
                x -= 1;
                break;
        }

        // if range of over, not execute move function
        if (x > 4)
            x -= 1;
        if (y > 4)
            y -= 1;
        if (x < -4)
            x += 1;
        if (y < -4)
            y += 1;

    }

    void turnRight() {
        if (d == 3)
            d = 0;
        else
            d += 1;
    }

    void turnLeft() {
        if (d == 0)
            d = 3;
        else
            d -= 1;
    }

    void printLocation() {
        System.out.println("(" + x + ", " + y + ")");
    }

}
