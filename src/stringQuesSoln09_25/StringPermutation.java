package stringQuesSoln09_25;

public class StringPermutation {
	
	public static void main(String[] args){	
		System.out.println(checkPermutation("pa ss", "sasp "));
		System.out.println(checkPermutation("fail","faim"));
	}

	//*Ch01_Q02/Check Permutation:* Given two string, write a method to decide if one is a permutation 
	//of the other.
	//Solution: Time Complexity: O(n)
	public static boolean checkPermutation(String str1, String str2){
		if(str1.length() != str2.length()) {
			return false;
		}
		int[] charset1 = new int[128];
		int[] charset2 = new int[128];
		// Count number of occurrence of each letter in both strings
		for(int i = 0; i < str1.length(); i++){
			int val = (int)str1.charAt(i);
			charset1[val]++;
			val = (int)str2.charAt(i);
			charset2[val]++;
		}
		// Check if count matches
		for(int i = 0; i < 128; i++){
			if(charset1[i] != charset2[i]){
				return false;
			}
		}
		return true;
	}
}
