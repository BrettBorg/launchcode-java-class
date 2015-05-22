/**
 * Created by Brett on 5/20/2015.
 */
public class MergeSort implements SortStrategy {
    public void sort(int[] sortArray) {

        doMergeSort(0, sortArray.length - 1, sortArray);
    }

    // method to divide array in half, sort and merge back together
    private void doMergeSort(int lowerIndex, int higherIndex, int[] sortArray) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle, sortArray);
            doMergeSort(middle + 1, higherIndex, sortArray);
            mergeParts(lowerIndex, middle, higherIndex, sortArray);
        }
    }

    // method for merging the array back together
    private void mergeParts(int lowerIndex, int middle, int higherIndex, int[] sortArray) {

        int[] tempMergArr = new int[sortArray.length];

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = sortArray[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                sortArray[k] = tempMergArr[i];
                i++;
            } else {
                sortArray[k] = tempMergArr[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            sortArray[k] = tempMergArr[i];
            k++;
            i++;
        }

    }
}
