package files;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] one = {2, 0};
		int[] two = {1};
		merge(one, 1, two, 1);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m + n];
        int num1 = 0, num2 = 0, length = m;
        if (n < m) {
            length = n;
        }
        for (int i = 0; i < m + n; i++) {
        	if (m > 0 && num1 >= m) {
            	newArray[i] = nums2[num2];
                num2++;
            } else if (n > 0 && num2 >= n) {
            	newArray[i] = nums1[num1];
                num1++;
            } else if (n == 0 && m > 0) {
            	newArray[i] = nums1[num1];
                num1++;
            } else if (m == 0 && n > 0) {
            	newArray[i] = nums2[num2];
                num2++;
            } else if (m > 0 && n > 0 && nums1[num1] < nums2[num2] && num1 < m) {
                newArray[i] = nums1[num1];
                num1++;
            } else if (m > 0 && n > 0 && nums1[num1] >= nums2[num2] && num2 < n) {
                newArray[i] = nums2[num2];
                num2++;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
        	nums1[i] = newArray[i];
        }
        for (int i = 0; i < newArray.length; i++) {
        	System.out.print(nums1[i] + " ");
        }
    }

}
