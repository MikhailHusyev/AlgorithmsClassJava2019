public class MergeSort{

    public <T extends Comparable> void sort(T[] set, int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        Object[] L = new Object[n1+1];
        Object[] R = new Object[n2+1];

        for (int i = 0; i < n1; i++) L[i] = set[p + i -1];

        for (int i = 0; i < n2; i++) R[i] = set[q + i];

        L[n1 + 1] = null;
        R[n2 + 1] = null;



    }
}
