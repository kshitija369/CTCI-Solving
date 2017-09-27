package stringQuesSoln;

public class Rotate {
	public static char[] cStr = null;
	public static void main(String[] args){	
		String str = "taco cat";
		cStr= str.toCharArray(); 
		System.out.println(rotateArr(2));
	}
	// *Ch01_Xtra01*: Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements in place.
	// http://www.geeksforgeeks.org/array-rotation/. (edited)
	private static String rotateArr(int n) {
		reverse(0, cStr.length);
		//split the array
		int end = cStr.length - n;
		// reverse both the splits
		reverse(0,end);
		// reverse both the splits
		reverse(end, cStr.length);
		return String.valueOf(cStr);
	}
	private static char[] reverse(int i, int len) {
		len = len - 1;
		char temp;
		while(i < len){
			temp = cStr[i];
			cStr[i++] = cStr[len];
			cStr[len--] = temp;
		}
		return cStr;
	}
}
