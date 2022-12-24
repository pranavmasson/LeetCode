package files;

public class removeElement {

	public static void main(String[] args) {
		int[] nums = {2,3,2,3,1,0};
		int val = 0;
		int count = removeElement(nums, val);
		System.out.println(count);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == val) {
                count++;
                if (i < nums.length - 1) {
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j+1];
                        nums[j+1] = -999;
                    }
                } else {
                    nums[i] = -999;
                }
            }
        }
        return nums.length - count;
    }

}
