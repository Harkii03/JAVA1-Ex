package package_delta;

import package_alga.Alpha;
import package_alga.Gamma;
import package_beta.Beta;

public class Delta {
    Alpha alpha = new Alpha();
    Beta beta = new Beta();
    Gamma gamma = new Gamma();

    public Delta() {
        alpha.show(gamma);
        beta.show(gamma);
        gamma.show(alpha);
    }

    public static void main(String[] args) {
        new Delta();
    }
}