import java.util.*;

public class Diogonal_Sum {

    public static void main(String[] args) {
        
    
        int matrix[][] ={{1,2,3,4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};

        int n = matrix.length, m = matrix[0].length;

        int sum=0;
        for(int i=0; i<n; i++){
            //primary diag.
            sum += matrix[i][i];

            //secondary diag.
            if(i != n-1-i)
                sum += matrix[i][n-i-1];
        }
        System.out.println(sum);
    }
}
