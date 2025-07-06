import java.util.*;

public class four_sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            while (j < n) {
                int p = j + 1, q = n - 1;

                while (p < q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];

                    if (sum > target) {
                        q--;
                    } else if (sum < target) {
                        p++;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;

                        while (p < q && nums[p] == nums[p - 1]) p++;
                    }
                }

                j++;
                while (j < n && nums[j] == nums[j - 1]) j++;
            }
        }

        return ans;
    }
}
