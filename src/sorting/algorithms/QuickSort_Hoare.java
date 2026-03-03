package sorting.algorithms;

import java.util.Arrays;

public class QuickSort_Hoare {

    static int partition(int arr[], int l, int r){
        int pivot = arr[l];

        int i=l-1, j= r+1;
        while(true){
            do{
                i++;
            } while(arr[i]<pivot);
            do{
                j--;
            } while(arr[j]>pivot);

            if(i>=j)
                return j;

            swap(arr, i , j);
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quicksort(int arr[], int l, int r){
        if(l<r){
            int p = partition(arr, l, r);
            quicksort(arr, l, p);
            quicksort(arr, p+1, r);
        }
    }

    static void quicksortTailCallElimination(int arr[], int l, int r){
        while(l<r){
            int p = partition(arr, l, r);
            quicksortTailCallElimination(arr, l, p);
            l=p+1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,4,7,9,3,10,5};

        quicksortTailCallElimination(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
