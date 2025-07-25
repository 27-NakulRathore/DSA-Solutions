import java.util.*;

public class Spriral_Matrix {
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};

        int n = matrix.length, m = matrix[0].length;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int i=startCol; i<=endCol; i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            //right
            for(int j=startRow+1; j<=endRow; j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            //bottom
            for(int i=endCol-1; i>=startCol; i--){
                if(startRow == endCol){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            //left
            for(int j=endRow-1; j>=startRow+1; j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
