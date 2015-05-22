/**
 * Created by Brett on 5/18/2015.
 */
public class InsertionSort implements SortStrategy {
    public void sort(int[] sortArray) {

        for (int i = 1; i < sortArray.length; i++) {
            int j = i;

            while (j > 0 && sortArray[j] < sortArray[j - 1]) {
                int temp = sortArray[j - 1];
                sortArray[j - 1] = sortArray[j];
                sortArray[j] = temp;
                j--;
            }
        }
    }
}
