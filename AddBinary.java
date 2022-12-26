package files;

import java.util.Arrays;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		String c = addBinary(a, b);
		System.out.println(c);
	}
	
	public static String addBinary(String a, String b) {
	       int length = a.length();
	       if (b.length() > a.length()) {
	           length = b.length();
	       }
	       int aarray[] = new int[length];
	       Arrays.fill(aarray, 0);
	       int barray[] = new int[length];
	       Arrays.fill(barray, 0);
	       int count = 0;
	       for (int i = a.length() - 1; i >= 0; i--) {
	           aarray[count] = Character.getNumericValue(a.charAt(i));
	           count++;
	       }
	       count = 0;
	       for (int i = b.length() - 1; i >= 0; i--) {
	           barray[count] = Character.getNumericValue(b.charAt(i));
	           count++;
	       }
	       int carry = 0;
	       String binary = "";
	       for (int i = 0; i < aarray.length; i++) {
	           int digit = aarray[i] + barray[i] + carry;
	           if (digit == 0) {
	               binary += 0;
	               carry = 0;
	           } else if (digit == 1) {
	               binary += 1;
	               carry = 0;
	           } else if (digit == 2) {
	               binary += 0;
	               if (carry == 1) {
	                   carry = 0;
	               }
	               carry = 1;
	           } else if (digit == 3) {
	               binary += 1;
	               carry = 1;
	           }
	       }
	       if (carry == 1) {
	           binary += 1;
	       }
	       return new StringBuffer(binary).reverse().toString();
	    }
	
//	public static String addBinary(String a, String b) {
//	       char aArr[] = new char[a.length()];
//	       int count = 0;
//	       for (int i = a.length() - 1; i >= 0; i--) {
//	           aArr[count] = a.charAt(i);
//	           count++;
//	       }
//	       count = 0;
//	       char bArr[] = new char[b.length()];
//	       for (int i = b.length() - 1; i >= 0; i--) {
//	    	   bArr[count] = b.charAt(i);
//	           count++;
//	       }
//	       int length = aArr.length;
//	       if (bArr.length < aArr.length) {
//	           length = bArr.length;
//	       }
//	       int binary[] = new int[length];
//	       int carry = 0;
//	       for (int i = 0; i < length; i++) {
//	           int digit = Character.getNumericValue(aArr[i]) + Character.getNumericValue(bArr[i]);
//	           if (digit + carry == 0 || digit + carry == 1) {
//	               binary[i] = digit + carry;
//	               carry = 0;
//	           } else if (digit == 2) {
//	               binary[i] = 0;
//	               carry = 0;
//	           } else if (digit == 2) {
//	               binary[i] = 0;
//	               carry = 1;
//	           }
//	       }
//	       String binaryString = "";
//	       for (int i = 0; i < binary.length; i++) {
//	           binaryString += binary[i];
//	       }
//	       if (length == a.length() && b.length() > a.length()) {
//	            for (int i = 0; i > b.length() - a.length(); i++) {
//	                if (carry == 1) {
//	                    if (b.charAt(i) == '1') {
//	                    	binaryString += '0';
//	                        carry = 1;
//	                    } else {
//	                    	binaryString += '1';
//	                        carry = 0;
//	                    }
//	                } else {
//	                     if (b.charAt(i) == '1') {
//	                    	 binaryString += '1';
//	                        carry = 0;
//	                    } else {
//	                    	binaryString += '0';
//	                        carry = 0;
//	                    }
//	                }
//	            }
//	        } else if (length == b.length() && a.length() > b.length()){
//	            for (int i = 0; i < a.length() - b.length(); i++) {
//	                if (carry == 1) {
//	                    if (a.charAt(i) == '1') {
//	                    	binaryString += '0';
//	                        carry = 1;
//	                    } else {
//	                    	binaryString += '1';
//	                        carry = 0;
//	                    }
//	                } else {
//	                    if (a.charAt(i) == '1') {
//	                    	binaryString += '1';
//	                        carry = 0;
//	                    } else {
//	                    	binaryString += '0';
//	                        carry = 0;
//	                    }
//	                }
//	            }   
//	        }
//	       if (carry == 1) {
//	           binaryString += 1;
//	       }
//	       String binaryReturn = new StringBuffer(binaryString).reverse().toString();
//	       return binaryReturn;
//	    }
//	
//	public static String addBinary(String a, String b, String c) {
//        String binary = "";
//        int length = a.length();
//        int carry = 0;
//        if (b.length() < a.length()) {
//            length = b.length();
//        }
//        for (int i = length - 1; i >= 0; i--) {
//            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
//                if (carry == 1) {
//                    binary += 1;
//                    carry = 0;
//                } else {
//                    binary += 0;
//                    carry = 1;
//                }
//            } else if(a.charAt(i) == '1' && b.charAt(i) == '0') {
//                if (carry == 1) {
//                    binary += 0;
//                    carry = 1;
//                } else {
//                    binary += 1;
//                    carry = 0;
//                }
//            } else if(a.charAt(i) == '0' && b.charAt(i) == '1') {
//                if (carry == 1) {
//                    binary += 0;
//                    carry = 1;
//                } else {
//                    binary += 1;
//                    carry = 0;
//                }
//            } else {
//                if (carry == 1) {
//                    binary += 1;
//                    carry = 0;
//                } else {
//                    binary += 0;
//                    carry = 0;
//                }
//            }
//        }
//        if (length == a.length() && b.length() > a.length()) {
//            for (int i = b.length() - 1; i > a.length() - 1; i--) {
//                if (carry == 1) {
//                    if (b.charAt(i) == '1') {
//                        binary += '0';
//                        carry = 1;
//                    } else {
//                        binary += '1';
//                        carry = 0;
//                    }
//                } else {
//                     if (b.charAt(i) == '1') {
//                        binary += '1';
//                        carry = 0;
//                    } else {
//                        binary += '0';
//                        carry = 0;
//                    }
//                }
//            }
//        } else if (length == b.length() && a.length() > b.length()){
//            for (int i = a.length() - 1; i > b.length() - 1; i--) {
//                if (carry == 1) {
//                    if (a.charAt(i) == '1') {
//                        binary += '0';
//                        carry = 1;
//                    } else {
//                        binary += '1';
//                        carry = 0;
//                    }
//                } else {
//                    if (a.charAt(i) == '1') {
//                        binary += '1';
//                        carry = 0;
//                    } else {
//                        binary += '0';
//                        carry = 0;
//                    }
//                }
//            }   
//        }
//        if (carry == 1) {
//            binary += '1';
//            carry = 0;
//        }
//        String binaryResult = new StringBuffer(binary).reverse().toString();
//        return binaryResult;
//    }

}
