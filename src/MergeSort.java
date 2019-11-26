public class MergeSort implements ArraySorter{

    public <T extends Comparable>void sort(T[] set){
        mergeSort(set, 0, set.length-1);
    }

    private <T extends  Comparable>void mergeSort(T[] A, int p, int r){

        if(p < r){
            int q = (int)(Math.floor((p + r)/2.0));

            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);

            merge(A, p,q,r);
        }
    }

    private  <T extends Comparable> void merge(T[] A, int p, int q, int r) {

        int n1 = q - p+1;
        int n2 = r - q;

        Comparable[] L = new Comparable[n1+1];
        Comparable[] R = new Comparable[n2+1];

        for (int i = 0; i < n1; i++) L[i] = A[p + i-1];

        for (int i = 0; i < n2; i++) R[i] = A[q + i];

        L[n1] = null;
        R[n2] = null;

        int i = 1;
        int j = 1;
        int k = p;

        while(k <= r){
            if (L[i-1].equals(R[j-1]) || L[i-1].compareTo(R[j-1]) < 0) {
                A[k] = (T) L[i-1];
                i++;
            } else{
                A[k] = (T) R[j-1];
                j++;
            }
            k++;
        }

    }
}
