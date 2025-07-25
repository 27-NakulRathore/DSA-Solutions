import java.util.*;

public class Search_SortedArray {

    // Search in a sorted 2D matrix
    public static void Search_SortedArray(int[][] matrix, int key){
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m - 1;

        while(row < n && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key " + key + " found at (" + row + "," + col + ")");
                return;
            }
            else if(matrix[row][col] > key){
                col--; // move left
            }
            else{
                row++; // move down
            }
        }

        System.out.println("Key " + key + " not found.");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 29;
        Search_SortedArray(matrix, key);
    }
}
