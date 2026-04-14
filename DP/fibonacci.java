import java.util.*;

public class fibonacci {

    public static int fib(int n){
        if(n==0 || n==1) return n;
         int[] arr= new int[n+1];
        
        if(arr[n] != 0){
            return arr[n];
        }
        arr[n] = fib(n-1) + fib(n-2);
        return arr[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
}
