public class HeapSort {

    private int parent(int i){
        return (int)Math.floor(i/2.0);
    }

    private int left (int i){
        return 2 * i;
    }

    private int right (int i){
        return  (2 * i) + 1 ;
    }

    public void heapSort (Comparable[] A){
        buildMaxHeap(A);
        for(int i = A.length-1; i >= 1; i--){
            Comparable swap = A[0];
            A[0]= A[i];
            A[i]=swap;

            maxHeapify(A,i, 0);
        }
    }

    private void buildMaxHeap (Comparable[] A){
        for(int i = A.length/2-1; i >= 0; i--) {
            maxHeapify(A, A.length, i);
        }
    }

    private <T extends Comparable> void maxHeapify (Comparable[] A,int arraySize, int i){
        int l = left(i);
        int r = right(i);

        int largest;

        if( l < arraySize && A[l].compareTo(A[i]) > 0){
            largest = l;
        }else{
            largest = i;
        }
        if( r < arraySize && A[r].compareTo(A[largest]) > 0){
            largest = r;
        }

        if(largest != i){
            Comparable swap = A[i];
            A[i] = A[largest];
            A[largest]= swap;
            maxHeapify(A, arraySize, largest);
        }
    }
}
