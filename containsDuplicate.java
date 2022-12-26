package files;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

	public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int v : nums) {
            set.add(v);
        }
        if (set.size() == nums.length) {
            return false;
        }
        return true;
    }
	
}
