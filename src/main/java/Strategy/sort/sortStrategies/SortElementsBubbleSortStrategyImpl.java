package Strategy.sort.sortStrategies;

import Strategy.sort.SortElementsStrategy;

import java.util.ArrayList;
import java.util.List;

public class SortElementsBubbleSortStrategyImpl extends SortElementsAbstractStrategy implements SortElementsStrategy {

    public SortElementsBubbleSortStrategyImpl() {
        this.sortedList = new ArrayList<>();
    }
    @Override
    public List<Integer> sortList(int[] listToSort) {

        for(int i = 0; i < listToSort.length - 1; i++) {
            for(int j = 0; j < listToSort.length; j++) {
                int tmp = listToSort[i];
                listToSort[i] = listToSort[j];
                listToSort[j] = tmp;
            }
        }

        for (int j : listToSort) {
            sortedList.add(j);
        }

        return sortedList;
    }
}
