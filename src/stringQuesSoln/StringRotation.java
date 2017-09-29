package stringQuesSoln;

public class StringRotation {

	public static String str = "waterbottle"; 
	public static char[] cStr = str.toCharArray();
	
	public static void main(String[] args){	
		System.out.println(isSubstring("erbottlewat"));
	}
	
	// Ch01_Q09 / String Rotation: Assume you have a method isSubstring which checks if one word is a substring 
	// of another. Given two strings, s1 and s2, write a code to check if s2 is a rotation of s1 using only one 
	// call to isSubstring
	// Example:
	// "waterbottle" is a rotation of "erbottlewat"
	private static boolean isSubstring(String substr) {
		int n=1;
		String tempstr = null;
		while(n<cStr.length){
			reverse(0, cStr.length);
			// split the array
			int end = cStr.length - n;
			// reverse both the splits
			reverse(0,end);
			// reverse both the splits
			reverse(end, cStr.length);
			// check if strings are equal;
			tempstr = String.valueOf(cStr);
			if(tempstr.equals(substr)){
				System.out.println("String rotations: " + n);
				return true;
			}
			n++;
			cStr = str.toCharArray();
		}
		return false;
	}
	private static void reverse(int i, int len) {
		len = len - 1;
		char temp;
		while(i < len){
			temp = cStr[i];
			cStr[i++] = cStr[len];
			cStr[len--] = temp;
		}
	}
	
}
