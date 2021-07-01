package exercise2;

public class Palindrome {
	
	static void checkPalindrome(String s){
		StringBuffer sb = new StringBuffer(s);
		if(sb == sb.reverse()) {
			System.out.println("String is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkPalindrome("level");
	}

}
