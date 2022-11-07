package Strategy.sort;

import java.util.Random;

public class SortElementsContextImpl extends SortElementsAbstractContext {

    public SortElementsContextImpl() {
        this.arr = generateRandomArray();
    }
    @Override
    public void setStrategy(SortElementsStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    @Override
    public int[] generateRandomArray() {

        Random rd = new Random();
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }

        return arr;
    }
}
