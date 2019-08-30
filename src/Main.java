public class Main {

    public  static void  main(String args[]){

        Integer[] dataSet = new Integer[]{10,2,1,5,3,7,8,0};

        ArraySorter sortingAlgorithm = new InsertionSort();

        sortingAlgorithm.sort(dataSet);
        printValues(dataSet);
    }


    public static<T> void printValues(T[] values){

        for(int i = 0; i < values.length; i++){
            System.out.println(values[i].toString());
        }

    }
}
