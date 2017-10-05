package stringQuesSoln;

public class Palindrome {
	
	public static void main(String[] args){	
		System.out.println(isPalindrome("taco cat"));
		System.out.println(isPalindrome("taco cati"));
	}
	
	// *Ch01_Q04/Palindrome Permutation:* Given a string write a function to check if it is a permutation
	// of a palindrome. A palindrome is a word or phrase that is same forwards and backwards. A permutation 
	// is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
	// Example:
	// Input: Tact Coa
	// Output: True (permutations: "taco cat", "atco cta", etc.

	private static boolean isPalindrome(String string) {
		int[] ascii = new int[128];
		char[] cStr = ((string.replaceAll("\\s+","")).toLowerCase()).toCharArray();
		int fail = 0;			// for odd string length
		
		for (int i = 0; i < cStr.length; i++) {
			ascii[cStr[i]]++;
		}
		for (int i = 0; i < cStr.length; i++) {
			if(ascii[cStr[i]] % 2 !=0){
				if(fail == 0)
					fail = 1;
				else
					return false;
			}
		}			
		return true;
	}
	
	// Solve by recurssion.
	/*
	 */
}
