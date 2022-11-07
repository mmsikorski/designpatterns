package Strategy;


import Strategy.sort.SortElementsContext;
import Strategy.sort.SortElementsContextImpl;
import Strategy.sort.SortElementsStrategy;
import Strategy.sort.sortStrategies.SortElementsBubbleSortStrategyImpl;
import Strategy.sort.sortStrategies.SortElementsSelectionSortStrategyImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String... args) {

        SortElementsStrategy sortElementsStrategy;
        SortElementsContext sortContext = new SortElementsContextImpl();

        sortElementsStrategy = new SortElementsBubbleSortStrategyImpl();
        sortContext.setStrategy(sortElementsStrategy);
        sortContext.useSortedList();


        sortElementsStrategy = new SortElementsSelectionSortStrategyImpl();
        sortContext.setStrategy(sortElementsStrategy);
        sortContext.useSortedList();

    }


}
