import java.util.*;

public class solution {

    public static void mergeSort(int arr[], int si, int ei) {
        //BASE case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid + 1, ei); //right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; //left iterator
        int j = mid + 1; //right iterator
        int k = 0;

        // Merge two sorted halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) { //left part
                temp[k++] = arr[i++];
            } 
            else { //right part
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements, if left part elem. remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Copy remaining elements, if right part elem. remaining
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[si + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
