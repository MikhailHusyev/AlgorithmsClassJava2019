import java.util.Random;

public class Main {

    public  static void  main(String args[]){

        Integer[] dataSetMergeSort = new Integer[]{1,2,3,2,6,12,13,5006,300};
        String[] dataSetStringMerge = new String[]{"Mike", "Vlad", "Andriy", "John", "Bob", "Victor", "Chad", "Me", "You"};
        HeapSort sorter = new HeapSort();
        sorter.heapSort(dataSetMergeSort);
        System.out.println("Sort: ");
        printValues(dataSetMergeSort);
    }


    //Generate a random Integer Array of size 100
    public static Integer[] randomIntegerArray(){

        Random randomNumberGenerator = new Random();

        int randomArraySize = randomNumberGenerator.nextInt(100);

        Integer[] returnArray = new Integer[randomArraySize];

        for(int i = 0; i < randomArraySize; i++){
            returnArray[i] = randomNumberGenerator.nextInt(1000);
        }

        return  returnArray;
    }

    //Print out the Values of the array
    public static<T> void printValues(T[] values){

        for(int i = 0; i < values.length; i++){
            System.out.println(values[i].toString());
        }

    }
}
