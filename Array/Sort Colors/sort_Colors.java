import java.util.Arrays;
public class sort_Colors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], increment low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Leave 1 in the middle
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high], decrement high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        sortColors(arr);

        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

}
