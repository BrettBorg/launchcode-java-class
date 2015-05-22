/**
 * Created by Brett on 5/15/2015.
 */
public class BubbleSort implements SortStrategy {
    public void sort(int[] sortArray) {

        for(int i = 0; i < sortArray.length; i++) {
            for(int j = 1; j < sortArray.length - i; j++) {
                if(sortArray[j-1] > sortArray[j]) {
                    int temp = sortArray[j-1];
                    sortArray[j-1] = sortArray[j];
                    sortArray[j] = temp;
                }
            }
        }
    }
}