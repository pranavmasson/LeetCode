package files;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target && i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}
