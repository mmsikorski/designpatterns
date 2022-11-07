package Strategy.sort;

import java.util.List;

public abstract class SortElementsAbstractContext implements SortElementsContext{

    public SortElementsStrategy sortStrategy;
    int[] arr;

    public abstract void setStrategy(SortElementsStrategy sortStrategy);

    public abstract int[] generateRandomArray();

    @Override
    public void useSortedList() {
        long start = System.currentTimeMillis();
        List<Integer> sortedList = this.sortStrategy.sortList(getArr());

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        String s = new StringBuilder("List is sorted, time elapsed: ").append(timeElapsed).toString();

        System.out.println(s);
    }


    public int[] getArr() {
        return arr;
    }
}
