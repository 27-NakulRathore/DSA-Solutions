import java.util.*;

public class solution {
    public static void selectionSort(int arr[]){

        for(int i = 0; i < arr.length-1; i++){
            int smallest = i;
            //find the smallest elem.
            for(int j = i+1; j <= arr.length-1; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        selectionSort(array);
        printArray(array);
    }
}
