package package_beta;

import package_alga.Alpha;
import package_alga.Gamma;

public class Beta extends Alpha {
    private int y = 30; // only Beta

    public void show(Gamma g) {
        System.out.println("Beta");
        System.out.println("u: " + u);
        System.out.println("v: " + g.v);
        System.out.println("y: " + y);
        System.out.println();
    }
}