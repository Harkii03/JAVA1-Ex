public class AdvancedSortingMachine extends SortingMachine {
    int time_start;
    int time_end;

    public AdvancedSortingMachine(Strategy strategy) {
        super(strategy);
    }

    public void sort(int[] data) {
        System.out.println(strategy.getClass().getName());
        time_start = (int) System.currentTimeMillis();
        strategy.sort(data);
        time_end = (int) System.currentTimeMillis();
        System.out.println("time: " + (time_end - time_start));
    }
}
