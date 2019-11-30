public class MergeSort implements ArraySorter{

    public <T extends Comparable>void sort(T[] set){
        mergeSort(set, 0, set.length-1);
    }

    /*
     Merge sort method.
     */
    private <T extends  Comparable>void mergeSort(T[] A, int p, int r){

        if(p < r){
            int q = (int)(Math.floor((p + r)/2.0));

            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);

            merge(A, p,q,r);
        }
    }

    private  <T extends Comparable> void merge(T[] A, int p, int q, int r) {

        int n1 = q - p +1;
        int n2 = r - q;

        Comparable[] L = new Comparable[n1];
        Comparable[] R = new Comparable[n2];

        for (int i = 0; i < n1; i++) L[i] = A[p + i];

        for (int i = 0; i < n2; i++) R[i] = A[q + i+1];

        int i = 0;
        int j = 0;
        int k = p;

        while(k <= r){
            if (i > n1-1) {
                A[k] = (T) R[j];
                j++;
            } else if(j > n2-1){
                A[k] = (T) L[i];
                i++;
            }else if(L[i].compareTo(R[j]) < 0 || L[i].equals(R[j])){
                A[k] = (T) L[i];
                i++;
            }else{
                A[k] = (T)R[j];
                j++;
            }
            k++;
        }

    }
}
