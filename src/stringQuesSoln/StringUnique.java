package stringQuesSoln;

public class StringUnique {

	public static void main(String[] args){
		System.out.println(isUnique1("Yes Uniq"));
		System.out.println(isUnique1("Not Uniique"));	
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

}
