public class MergeSort{

    public <T extends Comparable> void sort(T[] set, int p, int q, int r) {

        int n1 = q - p+1;
        int n2 = r - q;

        Comparable[] L = new Comparable[n1+1];
        Comparable[] R = new Comparable[n2+1];

        for (int i = 0; i < n1; i++) L[i] = set[p + i];

        for (int i = 0; i < n2; i++) R[i] = set[q + i +1];

        L[n1] = null;
        R[n2] = null;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n1 && j < n2){

            if(L[i].equals(R[j]) || L[i].compareTo(R[j]) < 0){
                set[k] = (T)L[i];
                i++;
            }else{
                set[k] = (T)R[j];
                j++;
            }
            k++;
        }


    }
}
