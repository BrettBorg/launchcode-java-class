/**
 * Created by Brett on 5/18/2015.
 */
public class ArraySorter {
    private SortStrategy strategy = null;

    // method for performing the sort
    public void sortInt(int[] sortArray) {
        strategy.sort(sortArray);
    }

    // method for setting the strategy to the proper sort strategy
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
}
