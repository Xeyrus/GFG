package sorting.algorithms;

import java.util.Arrays;

public class QuickSort_Naive {

    static int partition(int arr[], int l, int p, int r){
        int pivot = arr[p], k=0;
        int res[] = new int[r-l+1];

        for(int i=l;i<=r;i++)
            if(arr[i]<=pivot && i!=p)
                res[k++] = arr[i];

        p=k;
        res[k++]=pivot;

        for(int i=l;i<=r;i++)
            if(arr[i]>pivot)
                res[k++]=arr[i];

        for(int i=0;i<r-l+1;i++)
            arr[l+i] = res[i];

        return l+p;
    }

    static void quicksort(int arr[], int l, int r){
        if(l<r){
            int p =l + (r-l)/2;
            p=partition(arr, l, p, r);
            quicksort(arr, l, p-1);
            quicksort(arr, p+1, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,4,7,9,3,10,5};

        quicksort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

}
