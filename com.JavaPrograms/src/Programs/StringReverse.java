//Reverse the string
package Programs;

public class StringReverse {
	public static void reverseStringUsingCharAt(String s){
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}

	public static void reverseString(String s){
		char[] c=s.toCharArray();
		int length=(c.length)-1;
		for(int i=length;i>0;i--){ 
			System.out.print(c[i]);
		}
	}

	public static String reverseStringUsingRecursion(String s){
		if(s.length()==0){
			return s;
		}
		return reverseStringUsingRecursion(s.substring(1)) +s.charAt(0); 
	}


	public static void main(String[] args) {
		String s="java is a programming language";
		//reverseStringUsingCharAt(s);
		//reverseString(s);
		System.out.println(reverseStringUsingRecursion(s));
	}

}
