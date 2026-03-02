package sorting.algorithms;

public class InsertionSort {
    static void sort(int arr[]){
        int key,j;
        for (int i = 1; i < arr.length; i++) {
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,5,6,3};

        sort(arr);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
