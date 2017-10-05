package stringQuesSoln;

public class OneAway {

	public static void main(String[] args){	
		System.out.println(isOneAway("pale", "ple"));
		System.out.println(isOneAway("pale", "pales"));
		System.out.println(isOneAway("pale", "bale"));
		System.out.println(isOneAway("pale", "bake"));
	}

	// *Ch01_05/One Away:* There are three types of edits that can be performed on strings: insert a character, remove a character,
	// or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
	// Example:
	// pale, ple -> true
	// pale, palse -> true
	// pale, bale -> true
	// pale, bake -> false
	private static boolean isOneAway(String string1, String string2) {
		char[] cStr1 = string1.toCharArray();
		char[] cStr2 = string2.toCharArray();
		int opType = 0;					// Lets assume 1 = Remove, 2 = Insert, 3 = Replace

		if((string1.length() - string2.length()) == 1){ 		// Potential Remove operation.
			opType = 1;
		}else if((string1.length() - string2.length()) == -1){	// Potential Insert operation.
			opType = 2;
		}else if(string1.length() == string2.length()){ 		// Potential Rename operation.
			opType = 3;
		}	
		int len = (string2.length() < string2.length()) ? string2.length() : string1.length() ;		// Assign length of smaller string
		if(opType!=0){
			int firstEdit = 0;
			for (int i = 0, j=0; i < len; i++, j++) {
				if(cStr1[i] != cStr2[j]){
					if(firstEdit == 0){
						firstEdit = 1;
						if(opType==1)
							j--;									// Adjust j value to accommodate 1 edit.	
						if(opType==2)
							i--;									// Adjust i value to accommodate 1 edit.	
					}else{
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}	
	
	// Number to edits to get the 2nd string.
}
