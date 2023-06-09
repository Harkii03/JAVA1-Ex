public class Directory extends Entity {
    private Entity[] List = new Entity[100];
    private int numberOfList = 0;

    public Directory(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (int i = 0; i < numberOfList; i++) {
            total += List[i].getSize();
        }
        return total;
    }

    public void add(Entity list) {
        List[numberOfList++] = list;
    }

    public void display() {
        for (int i = 0; i < numberOfList; i++) {
            System.out.print(List[i].getName() + " ");
        }
        System.out.println();
        System.out.println(this.getSize() + " bytes");
    }
}