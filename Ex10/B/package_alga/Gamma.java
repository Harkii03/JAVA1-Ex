package package_alga;

public class Gamma {
    public int v = 1000; // All class
    int w = 777; // only Alpha and Gamma

    public void show(Alpha a) {
        System.out.println("Gamma");
        System.out.println("u: " + a.u);
        System.out.println("v: " + v);
        System.out.println("w: " + w);
        System.out.println("z: " + a.z);
        System.out.println();
    }
}