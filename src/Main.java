import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String fileName = "generated-numbers.txt";

    public  static void  main(String args[]){

        Integer[] array = readFile(5);

        //Insertion Sort
        InsertionSort insertionSort = new InsertionSort();
        long startTime = System.nanoTime();
        insertionSort.insertionSort(array);
        long endTime = System.nanoTime();

        writeFile(array, "Insertion Sort", array.length, startTime, endTime);
    }

    /*
    This method is used after the algorithm has run to print out the results onto a text document.

    Print Values: The method prints out the algorithm and the amount of data, the start time, the end time, the run time, and the values of the algorithm.
     */
    public static void writeFile(Comparable[] A, String algorithm, int size, long startTime, long endTime) {
        try {
            String fileName = algorithm+ " " + size + ".txt";
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");

            double startTimeSeconds = (double) startTime/1000000000;
            double endTimeSeconds = (double)endTime/1000000000;

            //Prints out identifiable text to the text file
            writer.println(algorithm + " Size Of: " + size);
            writer.println("Start Time Seconds: "  + startTimeSeconds);
            writer.println("End Time Seconds: " + endTimeSeconds);
            writer.println("Run Time Seconds: "  + (endTimeSeconds-startTimeSeconds));

            // Prints out numbers into the text file
            for(int i = 0; i < A.length; i++){
                writer.println(A[i]);
            }

            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] readFile(int size){
        Integer[] array = new Integer[size];

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));

            for(int i = 0; i < size; i++){
                array[i] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return  array;
    }

    //Generate a random Integer Array of size 100
    public static void generateIntegersToFile(){
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");

            for(int i = 1; i <= 10; i++){
                SecureRandom random = new SecureRandom();
                int num = random.nextInt(100000);
                writer.println(num);
            }

            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    //Print out the Values of the array
    public static<T> void printValues(T[] values){

        for(int i = 0; i < values.length; i++){
            System.out.println(values[i].toString());
        }

    }
}
