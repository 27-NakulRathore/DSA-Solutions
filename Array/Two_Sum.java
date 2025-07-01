import java.util.HashMap;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // stores number -> index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // what we need to find
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // found the pair
            }
            map.put(nums[i], i); // store current number with its index
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
