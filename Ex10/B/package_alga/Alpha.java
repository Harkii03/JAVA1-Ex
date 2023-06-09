package package_alga;

public class Alpha {
    protected int u = 30; // only Alpha, Gamma and Beta
    private int x = 120; // only Alpha
    int z = 86; // only Alpha and Gamma

    public void show(Gamma g) {
        System.out.println("Alpha");
        System.out.println("u: " + u);
        System.out.println("v: " + g.v);
        System.out.println("w: " + g.w);
        System.out.println("x: " + x);
        System.out.println("z: " + z);
        System.out.println();
    }
}