package sorting.algorithms;

public class SelectionSort {
    static void sort(int arr[]){
        int min_ind;
        for (int i = 0; i < arr.length-1; i++) {
            min_ind=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            swap(arr,i,min_ind);
        }
    }

    static void swap(int arr[],int i, int min_ind){
        int temp = arr[i];
        arr[i] = arr[min_ind];
        arr[min_ind] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,5,6,3};

        sort(arr);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
