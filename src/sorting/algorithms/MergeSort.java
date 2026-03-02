package sorting.algorithms;

public class MergeSort {
    static void merge(int arr[],int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i,j;
        for(i=0;i<n1;i++)
            left[i]=arr[low+i];

        for(j=0;j<n2;j++)
            right[j]=arr[mid+j+1];

        int k=low;
        i=0;j=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }

        while(i<n1)
            arr[k++]=left[i++];

        while(j<n2)
            arr[k++]=right[j++];
    }

    static void sort(int arr[],int low, int high){
        if(high>low){
            int mid = low+(high-low)/2;
            sort(arr, low, mid);
            sort(arr, mid+1,high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,5,6,3};
        int low = 0;
        int high = arr.length-1;
        sort(arr, 0,high);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
