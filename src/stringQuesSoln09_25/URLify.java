package stringQuesSoln09_25;

public class URLify {

	public static void main(String[] args){	
		char[] str = {'a','b',' ','c','d','e','f',' ','g','h','i','j','k',' ',' ',' ',' '};
		System.out.println(URLify(str, 13));
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
