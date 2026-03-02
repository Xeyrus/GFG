package sorting.questions;

public class Union2SortedArrays {

    static void union(int arr1[], int arr2[]) {
        int i = 0, j = 0, m = arr1.length, n = arr2.length;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j]+" ");
                j++;
            }
            else {
                System.out.print(arr1[i]+" ");
                int key = arr1[i];
                while(i<m && arr1[i]==key)
                    i++;
                while(j<n && arr2[j]==key)
                    j++;
            }
        }
        while(i<m) {
            if (i > 0 && arr1[i] != arr1[i - 1]) {
                System.out.println(arr1[i]);
            }
            i++;
        }

        while(j<n) {
            if (j > 0 && arr2[j] != arr2[j - 1]) {
                System.out.println(arr2[j]);
            }
            i++;
        }

    }

    public static void main(String[] args) {
        int arr1[] = {10, 20, 20, 40, 60, 70, 70, 80, 90};
        int arr2[] = {2, 20, 20, 20, 40, 70, 80};

        union(arr1, arr2);
    }
}
