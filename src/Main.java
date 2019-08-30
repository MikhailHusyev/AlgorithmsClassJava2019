import java.util.Random;

public class Main {

    public  static void  main(String args[]){

        Integer[] dataSetMergeSort = new Integer[]{1,2,3,2,6,12,13};


        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(dataSetMergeSort, 0, 2, 6);

        System.out.println("Insertion Sort: ");
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
