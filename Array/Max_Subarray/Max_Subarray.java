package Max_Subarray;

public class Max_Subarray {
     public static int Max_Sum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int curSum = 0;
            for (int j = i; j < n; j++) {
                curSum += arr[j];
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, -4, 5, 4, -1, 7, -8};
        int result = Max_Sum(nums);
        System.out.println(result); // Expected: 15
    }
}
