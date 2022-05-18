package files;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		int shortestLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortestLength) {
                shortestLength = strs[i].length();
            }
        }
        String prefix = "";
        for (int i = 0; i < shortestLength; i++) {
            char firstChar = strs[0].charAt(i);
            boolean shouldAdd = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != firstChar) {
                    shouldAdd = false;
                }
            }
            if (shouldAdd == true) {
                prefix += firstChar;
            } else if (shouldAdd == false) {
                break;
            }
        }
        return prefix;
    }

	public static void main(String[] args) {
		String[] words = {"preposterous","pranav","precipitation"};
		System.out.println(longestCommonPrefix(words));
	}

}
