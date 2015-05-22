import org.junit.Test;

import junit.framework.TestCase;
/**
 * Created by Brett on 5/22/2015.
 */
public class SortTest extends TestCase {
    @Test
    public static void main(String[] args) {
        // define array with data
        int[] sortArray = {9,8,7,6,5,4,3,2,1,0,19,18,17,16,15,14,13,12,11,10,29,28,27,26,25,24,23,22,21,20,119,118,1171,116,115,114,113};
        ArraySorter bubble = new ArraySorter();
        // set the strategy to the bubble sort
        bubble.setStrategy(new BubbleSort());
        // start the timer
        long startTimeb = System.nanoTime();
        // perform the bubble sort
        bubble.sortInt(sortArray);
        // stop the timer
        long stopTimeb = System.nanoTime();
        // print the sorted array
        for(int i =0; i< sortArray.length; i++) {
            System.out.println(sortArray[i]);
        }
        // print the amount of time
        System.out.println("Elapsed time for bubble sort was " + (stopTimeb - startTimeb) + " in nano seconds.");

        // define array with data
        int[] sortArrayi = {9,8,7,6,5,4,3,2,1,0,19,18,17,16,15,14,13,12,11,10,29,28,27,26,25,24,23,22,21,20,119,118,1171,116,115,114,113};
        ArraySorter insertion = new ArraySorter();
        // set the strategy to the insertion sort
        insertion.setStrategy(new InsertionSort());
        // start the timer
        long startTimei = System.nanoTime();
        // perform the insertion sort
        insertion.sortInt(sortArrayi);
        // stop the timer
        long stopTimei = System.nanoTime();
        // print the sorted array
        for(int i =0; i< sortArrayi.length; i++) {
            System.out.println(sortArrayi[i]);
        }
        // print the amount of time
        System.out.println("Elapsed time for insertion sort was " + (stopTimei - startTimei) + " in nano seconds.");

        // define the array with data
        int[] sortArraym = {9,8,7,6,5,4,3,2,1,0,19,18,17,16,15,14,13,12,11,10,29,28,27,26,25,24,23,22,21,20,119,118,1171,116,115,114,113};
        ArraySorter merge = new ArraySorter();
        // set the strategy to the merge sort
        merge.setStrategy(new MergeSort());
        // start the timer
        long startTimem = System.nanoTime();
        // perform the merge sort
        merge.sortInt(sortArraym);
        // stop the timer
        long stopTimem = System.nanoTime();
        // print the sorted array
        for(int i =0; i< sortArraym.length; i++) {
            System.out.println(sortArraym[i]);
        }
        // print the amount of time
        System.out.println("Elapsed time for merge sort was " + (stopTimem - startTimem) + " in nano seconds.");
    }
}

