package Strategy.sort.sortStrategies;

import Strategy.sort.SortElementsStrategy;

import java.util.ArrayList;
import java.util.List;

public class SortElementsSelectionSortStrategyImpl extends SortElementsAbstractStrategy implements SortElementsStrategy {

    public SortElementsSelectionSortStrategyImpl() {
        this.sortedList = new ArrayList<>();
    }

    @Override
    public List<Integer> sortList(int[] listToSort) {

        int n = listToSort.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (listToSort[j] < listToSort[min_idx])
                    min_idx = j;


            int temp = listToSort[min_idx];
            listToSort[min_idx] = listToSort[i];
            listToSort[i] = temp;
        }

        for (int j : listToSort) {
            sortedList.add(j);
        }

        return sortedList;
    }
}
