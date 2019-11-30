public class QuickSort {

    public void quick(Comparable A[]){
        quickSort(A, 0, A.length-1);
    }
    public  void quickSort(Comparable A[], int p, int r){
        if(p < r){
            int q = partition(A, p, r);
            quickSort(A,p,q-1);
            quickSort(A,q+1,r);
        }
    }

    private int partition(Comparable A[], int p, int r){
        Comparable x = A[r];
        int i = p - 1;

        for(int j = p; j <= r-1; j++){
            if(A[j].compareTo(x) < 0){
                i++;
                Comparable swap = A[i];
                A[i] = A[j];
                A[j] = swap;
            }
        }
        Comparable swap = A[i+1];
        A[i+1] = A[r];
        A[r] = swap;
        return i+1;
    }
}
