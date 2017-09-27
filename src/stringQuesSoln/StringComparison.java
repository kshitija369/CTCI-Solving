package stringQuesSoln;

public class StringComparison {
	
	public static void main(String[] args){	
		System.out.println(strCompression("aabcccccaaa"));
		System.out.println(strCompression("aabc"));
	}	
	
	//*Ch01_06/String Comparison:* Implement a method to perform basic string compression 
	// using the counts of repeated characters. For example, the string aabcccccaaa would
	// become a2b1c5a3. If the "compressed" string would not become smaller than original string, 
	// your method should return the original string. You can assume the string has only 
	// uppercase and lowercase letters(a-z).
	
	public static String strCompression(String str){
		char[] cStr = str.toCharArray();
		String newStr = new String("");
		char currChar = cStr[0];
		int  currCharCount = 1;
		
		for(int i=1; i<str.length(); i++){
			if(currChar == cStr[i]){
				currCharCount++;
			}else{
				newStr = newStr + String.valueOf(currChar);
				newStr = newStr + String.valueOf(currCharCount);
				currChar = cStr[i];
				currCharCount = 1;
			}			
		}		
		newStr = newStr + String.valueOf(currChar);
		newStr = newStr + String.valueOf(currCharCount);
		
		if(str.length() <= newStr.length()){
			return str;
		}
		return newStr;
	}
}
