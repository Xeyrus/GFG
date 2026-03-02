package sorting.algorithms;

public class BubbleSort {

    static void sort(int arr[]){
        boolean swapped = false;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j);
                    swapped=true;
                }
            }
            if(swapped==false)
                return;
        }
    }

    static void swap(int arr[],int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,5,6,3};

        sort(arr);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
