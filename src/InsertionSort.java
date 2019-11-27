/*
INSERTION SORT

Analysis:

 */

public class InsertionSort{

    /*
    Insertion sort method implementation

    <T> is a generic term.  Meaning that any data can be passed in to be sorted.
     */
    public <T extends Comparable> void insertionSort(T[] set) {
        for(int j = 1; j < set.length; j++){

            T key = set[j];
            int i = j - 1;

            while (i >= 0 && set[i].compareTo(key) > 0){
                set[i+1] = set[i];
                i = i -1;
            }

            set[i + 1 ] = key;

        }
    }
}
