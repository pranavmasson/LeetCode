package files;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "day";
		int result = lengthWord(s);
		System.out.println(result);
	}
	
	public static int lengthWord(String s) {
		int lastIndex = s.length() - 1;
        while(s.charAt(lastIndex) == ' ') {
            lastIndex--;
        }
        int firstIndex = lastIndex - 1;
        if (s.substring(0, lastIndex).contains(" ")) {
            while(s.charAt(firstIndex) != ' ' && firstIndex >= 0) {
                firstIndex--;
            }
        } else {
            firstIndex = 0;
        }
        return lastIndex - firstIndex;
	}

}
