package sorting.algorithms;

import java.util.Arrays;

public class QuickSort_Lomuto {
    static int partition(int arr[], int l, int r){

        int pivot = arr[r], i=-1;

        for(int j=0;j<=r;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, r);

        return i+1;
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quicksort(int arr[], int l, int r){
        if(l<r){
            int p = partition(arr, l, r);
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
