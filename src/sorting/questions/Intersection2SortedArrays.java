package sorting.questions;

public class Intersection2SortedArrays {

    static void intersection(int arr1[], int arr2[]){
        int i = 0, j = 0, m = arr1.length, n = arr2.length;
        while (i < m && j < n) {
            if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else{
                if(i>0 && arr1[i]!=arr1[i-1]){
                    System.out.print(arr1[i]+" ");
                }
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {10, 20, 20, 40, 60, 70, 70, 80};
        int arr2[] = {2, 20, 20, 20, 40, 70, 80};

        intersection(arr1, arr2);
    }
}
