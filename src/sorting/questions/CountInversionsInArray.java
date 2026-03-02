package sorting.questions;

public class CountInversionsInArray {
    static int merge(int arr[], int l, int m, int r){
        int n1 = m-l+1, n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0;i<n1;i++)
            left[i]=arr[l+i];
        for(int i=0;i<n1;i++)
            right[i]=arr[m+1+i];

        int res=0, i=0, j=0, k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k]=left[i++];
            else{
                arr[k]=right[j++];
                res+=n1-i;
            }
            k++;
        }

        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];

        return res;
    }

    static int mergesort(int arr[], int l, int r){
        if(r>l){
            int m = l + (r-l)/2;
            int x = mergesort(arr, l, m);
            int y = mergesort(arr, m+1, r);
            return x + y + merge(arr, l, m, r);
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,8,11,3,6,9,13};

        System.out.println("Inversion : " + mergesort(arr, 0, arr.length-1));
    }
}
