/**
 * Created by Brett on 5/26/2015.
 */
public class SortFactory {
    public SortStrategy getSort(String sortType) {
        if(sortType == null) {
            return null;
        }
        if(sortType.equalsIgnoreCase("BUBBLE")) {
            return new BubbleSort();

        } else if(sortType.equalsIgnoreCase("INSERTION")) {
            return new InsertionSort();

        } else if(sortType.equalsIgnoreCase("MERGE")) {
            return new MergeSort();
        }
        return null;
    }
}
