package Examples;

public class ReverseEachWordInAString {
	public static void main(String[] args) {
		String str="Welcome To Java and selenium";
		String[] words=str.split(" ");
		String reverseString= " ";
		for(String s:words) {
			String reversedWords=" ";
			for (int i=s.length()-1;i>=0;i--) {
				reversedWords=reversedWords+s.charAt(i);
			}
			reverseString=reverseString+ reversedWords+"";
		}System.out.println(reverseString);
	}
	
	
    
}
 