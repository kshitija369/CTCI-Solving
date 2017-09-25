package stringQuesSoln;

public class Date09_25 {

	public static void main(String[] args){
		//System.out.println(isUnique1("Yes Uniq"));
		//System.out.println(isUnique1("Not Uniique"));	
		
		//System.out.println(checkPermutation("pa ss", "sasp "));
		//System.out.println(checkPermutation("fail","faim"));
		
		char[] str = {'a','b',' ','c','d','e','f',' ','g','h','i','j','k',' ',' ',' ',' '};
		System.out.println(URLify(str, 13));
	}
	
	//*Ch01_Q01/Is Unique:* Implement an algorithm to determine if a string has all unique characters. 
	//What if you cannot use additional data structure?
	//Solution1: Time complexity = O(n square)
	public static boolean isUnique1(String str){	
		for (int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++){
				if(str.charAt(i) == str.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}	
	//Solution2: Using additional boolean array. Time complexity = O(n) 
	public static boolean isUnique2(String str){
		boolean[] charset = new boolean[128];		
		for (int i = 0; i < str.length(); i++) {
			int val = (int)str.charAt(i);
			if(charset[val]){
				return false;
			}else{
				charset[val] = true;
			}
		}
		return true;
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
	
	//Ch01_Q03/URLify: Write a method to replace all spaces in a string with '%20'. 
	//You may assume that the string has sufficient space at the end to hold additional characters, 
	//and that you are given the "true" length of the string. (Note: if implementing in Java, 
	//please use a character array so that you can perform this operation in place.)
	public static char[] URLify(char[] str, int truelen){
			
			int countSpc = 0; 
			//Pass1: Find no. of wide spaces in String
			for (int i = 0; i < truelen; i++) {
				if(str[i] == ' '){
					countSpc++;
				}
			}
			int actLen = truelen + 2*countSpc -1; 
			truelen = truelen - 1;
			//Pass2: Replace spaces
			while(truelen >= 0 ){
				if(str[truelen] != ' '){
					str[actLen--] = str[truelen--];
				}else{
					str[actLen--] = '0';
					str[actLen--] = '2';
					str[actLen--] = '%';
					truelen--;
				}
			}
			return str;
		}
}
