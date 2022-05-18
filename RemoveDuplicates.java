package files;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> newNums = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!newNums.contains(nums[i])) {
                newNums.add(nums[i]);
            }
        }
        for (int i = 0; i < newNums.size(); i++) {
            nums[i] = newNums.get(i);
        }
        return newNums.size();
    }

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}

}
