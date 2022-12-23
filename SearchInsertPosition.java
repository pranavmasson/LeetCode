package files;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1};
		int target = 1;
	}
	
	public static int searchInsert(int[] nums, int target) {
		int index = 0;
        if (nums[0] > target) {
            return 0;
        }
        if (nums.length == 1 && nums[0] < target) {
            return 1;
        } else if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target && nums[i + 1] >= target) {
                return i + 1;
            } else if (nums[i] == target) {
                return i;
            }
        }
        return nums.length;
	}

}
